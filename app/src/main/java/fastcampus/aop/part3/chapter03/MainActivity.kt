package fastcampus.aop.part3.chapter03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //step0 뷰를 초기화해주기
        initOnOffButton()
        initChangeAlarmTimeButton()

        //step1 데이터 가져오기

        //step2 뷰에 데이터 그려주기
    }

    private fun initOnOffButton() {
        val onOffButton = findViewById<Button>(R.id.onOffButton)
        onOffButton.setOnClickListener {
            // 데이터를 확인을 한다.

            // 온오프 에따라 작업을 처리한다.

            // 오프 -> 알람을 제거
            // 온 -> 알람을 등록

            // 데이터를 저장한다.
        }
   }

    private fun initChangeAlarmTimeButton() {

    }
}