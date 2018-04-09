<?php

namespace App\Presenters;

use App\Model\NewsManager;
use Nette\Application\UI\Form;

class NewsPresenter extends BasePresenter
{
  private $newsManager;
  
  function __construct(NewsManager $newsManager) {
    $this->newsManager = $newsManager;
  }
  
    public function renderDefault($order='title'){
		$this->template->data = $this->newsManager->readAll($order);
    }
  
    public function renderView($id) {
      $this->template->row = $this->newsManager->readOne($id);
    }
    
    public function actionDelete($id) {
      $this->newsManager->delete($id);
      $this->flashMessage("Záznam byl úspěšně smazán");
      $this->redirect("News:default");
    }
    
    public function renderInsert(){      
    }
    
    public function renderUpdate($id){    
      $article = $this->newsManager->readOne($id);
      if (!$article) {
          $this->error('Příspěvek nebyl nalezen');
      }
      $this['newsForm']->setDefaults($article->toArray());
    }
    
    public function createComponentNewsForm(){
      $form = new Form;
      
      $form->addText("title", "Titulek článku")
              ->setRequired(TRUE);
      $rubrika = array("sport"=>"Sport",
                       "politika"=>"Politika",
                       "zábava"=>"Zábava"); 
      $form->addSelect("category", "Rubrika", $rubrika)->setRequired(TRUE);
      $form->addTextArea("content", "Obsah článku")->setRequired(FALSE);
      $stars = array(1=>"1",2=>"2",3=>"3",4=>"4",5=>"5");
      $form->addRadioList("stars", "Hodnocení", $stars)->setRequired(TRUE);
      $form->addSubmit("submit", "Potvrdit");
      $form->onSuccess[] = array($this, "newsFormSucceeded");
      return $form;
    }
    
    public function newsFormSucceeded(Form $form, $values) {
      if (!$this->getUser()->isLoggedIn()) {
          $this->error('Pro vytvoření, nebo editování příspěvku se musíte přihlásit.');
      } else{
        $id_user = $this->getUser()->getId();
        $data = $values;
        $data["user_id"] = $id_user;
        $id_article = $this->getParameter('id');
        if($id_article){
          $this->newsManager->update($data,$id_article);
        }else{
          $this->newsManager->insert($data);
        }
      }
      $this->redirect("News:default");
    } 

}
