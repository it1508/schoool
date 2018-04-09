<?php

namespace App\Model;

use Nette;
use Nette\Security\Passwords;


/**
 * Users management.
 */
class NewsManager
{
	use Nette\SmartObject;

	const
		TABLE_NAME = 'news',
		COLUMN_ID = 'id',
		COLUMN_TITLE = 'title',
		COLUMN_CONTENT = 'content',
		COLUMN_CREATED_AT = 'created_at',
		COLUMN_USER_ID = 'user_id',
    COLUMN_CATEGORY = 'category',
    COLUMN_STARS = 'stars';


	/** @var Nette\Database\Context */
	private $database;

	public function __construct(Nette\Database\Context $db)
	{
		$this->database = $db;
	}
  
  public function readAll($order){
    return $this->database->table(self::TABLE_NAME)->order($order)->fetchAll();
  }

  public function readOne($id){
    return $this->database->table(self::TABLE_NAME)->get($id);
  }

  public function delete($id){
    try {
      $this->database->table(self::TABLE_NAME)
            ->where(self::COLUMN_ID, $id)->delete();
    } catch (Exception $e) {
       throw new Exception();
    }
  }
  
  public function insert($values){
    $this->database->table(self::TABLE_NAME)->insert($values);
  }
  
  public function update($values, $id){
    $row = $this->database->table(self::TABLE_NAME)->get($id);
    $row->update($values);
  }
}
