package com.pbjb.gr.pembelajaranbudayajawabarat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.pbjb.gr.pembelajaranbudayajawabarat.QuizContract.*;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "pbjb_quiz.db";
    private static final int DATABASE_VERSION = 5;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        Question q1 = new Question("Senjata tradisional Jawa Barat adalah ?", "A.Kujang", "B.Golok", "C.Keris", 1);
        addQuestion(q1);
        Question q2 = new Question("Salah satu tari adat Jawa Barat adalah ?", "A.Tari Ketuk Tilu", "B.Tari Piring", "C.Semua Benar", 1);
        addQuestion(q2);
        Question q3 = new Question("Rumah tradisional Jawa Barat adalah ?", "A.Rumah Kasepuhan", "B.Rumah Joglo", "C.Rumah Gadang", 1);
        addQuestion(q3);
        Question q4 = new Question("Rumah Kasepuhan dibuat oleh ?", "A.Sri Baduga", "B.Prabu Kiansantang", "C.Pangeran Cakrabuana", 3);
        addQuestion(q4);
        Question q5 = new Question("Tarian di upacara adat dalam menyambut panen padi adalah?", "A.Tari Topeng", "B.Tari Merak", "C.Tari Ketuk Tilu", 3);
        addQuestion(q5);
        Question q6 = new Question("Kujang dibuat pada abad ke ?", "A.8 atau 9", "B.7 atau 8", "C.6 atau 7", 1);
        addQuestion(q6);
        Question q7 = new Question("Menurut Sanghyang siksakanda ng karesian pupuh XVII, kujang adalah senjata kaum ?", "A.Miskin", "B.Petani", "C.Muda", 2);
        addQuestion(q7);
        Question q8 = new Question("Senjata kujang melambangkan", "A.Kekuatan", "B.Keberanian", "C.Jawaban A & B Benar", 3);
        addQuestion(q8);
        Question q9 = new Question("Berdasarkan fungsi, kujang dibagi menjadi ?", "A.3", "B.4", "C.5", 2);
        addQuestion(q9);
        Question q10 = new Question("Tarian Jaipong diciptakan pada tahun ?", "A.1961", "B.1916", "C.1966", 1);
        addQuestion(q10);
        Question q11 = new Question("Tari Topeng berasal dari", "A.Cirebon", "B.Garut", "C.Bogor", 1);
        addQuestion(q11);
        Question q12 = new Question("Tari Merak terinspirasi dari ?", "A.Burung Gagak", "B.Bebek", "C.Burung Merak", 3);
        addQuestion(q12);
        Question q13 = new Question("Rumah Kasepuhan dibuat pada tahun ?", "A.1530", "B.1529", "C.1528", 2);
        addQuestion(q13);
        Question q14 = new Question("Kesenian sisingaan berasal dari daerah ?", "A.Subang", "B.Bogor", "C.Cirebon", 1);
        addQuestion(q14);
        Question q15 = new Question("Wayang golek dimainkan oleh seorang sutradara yang disebut sebagai ?", "A.Aktor", "B.Dalang", "C.Sutradara", 2);
        addQuestion(q15);
        Question q16 = new Question("Alat musik Jawa Barat yang mirip dengan angklung adalah ?", "A.Kecapi", "B.Suling", "C.Calung", 3);
        addQuestion(q16);
        Question q17 = new Question("Kata 'Kacapi' dalam bahasa sunda merujuk kepada tanaman ?", "A.Sentul", "B.Anggrek", "C.Melati", 1);
        addQuestion(q17);
        Question q18 = new Question("Kuda renggong berasal dari ?", "A.Bogor", "B.Garut", "C.Sumedang", 3);
        addQuestion(q18);
        Question q19 = new Question("Tempat wisata Green Canyon berlokasi di ?", "A.Desa Kertayasa", "B.Desa Ciniti", "C.Desa Sindang Panon", 1);
        addQuestion(q19);
        Question q20 = new Question("Tempat wisata Panenjoan berlokasi di ?", "A.Desa Kertayasa", "B.Desa Ciniti", "C.Desa Sindang Panon", 3);
        addQuestion(q20);
        Question q21 = new Question("Tempat wisata Curug Cikaso berlokasi di ?", "A.Desa Kertayasa", "B.Desa Ciniti", "C.Desa Sindang Panon", 2);
        addQuestion(q21);
        Question q22 = new Question("Penduduk di sebuah kampung yang menolak intervensi dari luar adalah penduduk kampung", "A.Kampung Naga", "B.Kampung Duren", "C.Kampung Ular", 1);
        addQuestion(q22);
        Question q23 = new Question("Kampung Karuhun berlokasi di ?", "A.Sumedang Selatan", "B.Sumedang Utara", "C.Sumedang Timur", 1);
        addQuestion(q23);
        Question q24 = new Question("Doclang merupakan makanan khas ?", "A.Garut", "B.Bogor", "C.Cirebon", 2);
        addQuestion(q24);
        Question q25 = new Question("Tahu Gejrot merupakan makanan khas", "A.Garut", "B.Bogor", "C.Cirebon", 3);
        addQuestion(q25);
        Question q26 = new Question("Kata 'kerseus' di tarian kerseus berasal dari bahasa Belanda yang artinya", "A.Kasus", "B.Kursus", "C.Kurus", 2);
        addQuestion(q26);
        Question q27 = new Question("Tari Jaipong diciptakan oleh ?", "A.Raden Tjetje Somantri", "B.Kontjer", "C.Gugum Gumbira", 3);
        addQuestion(q27);
        Question q28 = new Question("Tarian yang diambil dari cerita rakyat Sunan Gunung Jati adalah", "A.Tari Topeng", "B.Tari Wayang", "C.Tari Buyung", 1);
        addQuestion(q28);
        Question q29 = new Question("Kesenian yang melambangkan perlawanan masyarakat terhadap VOC adalah", "A.Wayang Golek", "B.Kuda Renggong", "C.Sisingaan", 3);
        addQuestion(q29);
        Question q30 = new Question("Tempat wisata Kawah Putih berada di puncak gunung ?", "A.Salak", "B.Gede", "C.Patuha", 3);
        addQuestion(q30);
    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public List<Question> getAllQuestions() {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
