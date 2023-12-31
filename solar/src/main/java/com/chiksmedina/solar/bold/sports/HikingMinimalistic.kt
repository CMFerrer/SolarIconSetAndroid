package com.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SportsGroup

val SportsGroup.HikingMinimalistic: ImageVector
    get() {
        if (_hikingMinimalistic != null) {
            return _hikingMinimalistic!!
        }
        _hikingMinimalistic = Builder(
            name = "HikingMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 5.5f)
                curveTo(14.0f, 6.8807f, 12.8807f, 8.0f, 11.5f, 8.0f)
                curveTo(10.1193f, 8.0f, 9.0f, 6.8807f, 9.0f, 5.5f)
                curveTo(9.0f, 4.1193f, 10.1193f, 3.0f, 11.5f, 3.0f)
                curveTo(12.8807f, 3.0f, 14.0f, 4.1193f, 14.0f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.0f, 6.25f)
                curveTo(19.4143f, 6.25f, 19.75f, 6.5858f, 19.75f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(19.75f, 21.4142f, 19.4143f, 21.75f, 19.0f, 21.75f)
                curveTo(18.5858f, 21.75f, 18.25f, 21.4142f, 18.25f, 21.0f)
                verticalLineTo(10.9941f)
                curveTo(16.5565f, 11.9799f, 14.456f, 12.0665f, 12.6646f, 11.1708f)
                curveTo(12.6474f, 11.1622f, 12.6306f, 11.153f, 12.6141f, 11.1431f)
                curveTo(11.9234f, 10.7287f, 11.0363f, 11.1741f, 10.9562f, 11.9756f)
                lineTo(10.8876f, 12.6617f)
                curveTo(10.8294f, 13.243f, 11.1062f, 13.807f, 11.6016f, 14.1166f)
                lineTo(11.9349f, 14.3249f)
                curveTo(13.6853f, 15.4188f, 14.8215f, 17.2701f, 15.0044f, 19.3261f)
                lineTo(15.1474f, 20.9335f)
                curveTo(15.1842f, 21.3461f, 14.8795f, 21.7103f, 14.4669f, 21.747f)
                curveTo(14.0543f, 21.7838f, 13.6901f, 21.4791f, 13.6534f, 21.0665f)
                lineTo(13.5103f, 19.4591f)
                curveTo(13.3691f, 17.8713f, 12.4916f, 16.4417f, 11.1399f, 15.5969f)
                lineTo(10.8066f, 15.3886f)
                curveTo(9.8273f, 14.7765f, 9.2801f, 13.6616f, 9.395f, 12.5125f)
                lineTo(9.4636f, 11.8264f)
                curveTo(9.6522f, 9.9409f, 11.7282f, 8.8883f, 13.3582f, 9.8404f)
                curveTo(14.9095f, 10.605f, 16.7667f, 10.3848f, 18.0966f, 9.2766f)
                lineTo(18.25f, 9.1487f)
                verticalLineTo(7.0f)
                curveTo(18.25f, 6.5858f, 18.5858f, 6.25f, 19.0f, 6.25f)
                close()
                moveTo(9.1907f, 15.7746f)
                curveTo(9.5913f, 15.8799f, 9.8307f, 16.29f, 9.7254f, 16.6906f)
                lineTo(9.0f, 16.5f)
                curveTo(9.7254f, 16.6906f, 9.7254f, 16.6906f, 9.7254f, 16.6906f)
                lineTo(9.7248f, 16.693f)
                lineTo(9.7236f, 16.6976f)
                lineTo(9.7192f, 16.7137f)
                lineTo(9.7033f, 16.7718f)
                curveTo(9.6896f, 16.8213f, 9.6696f, 16.892f, 9.6439f, 16.9791f)
                curveTo(9.5926f, 17.153f, 9.5179f, 17.3942f, 9.4242f, 17.665f)
                curveTo(9.2426f, 18.1898f, 8.9684f, 18.8881f, 8.6283f, 19.4097f)
                curveTo(8.2709f, 19.9577f, 7.7098f, 20.5113f, 7.2771f, 20.903f)
                curveTo(7.0539f, 21.1051f, 6.8509f, 21.2763f, 6.7035f, 21.3973f)
                curveTo(6.6297f, 21.4579f, 6.5694f, 21.5062f, 6.527f, 21.5398f)
                lineTo(6.4773f, 21.579f)
                lineTo(6.4634f, 21.5897f)
                lineTo(6.4582f, 21.5938f)
                curveTo(6.4582f, 21.5938f, 6.4574f, 21.5944f, 6.0f, 21.0f)
                lineTo(6.4582f, 21.5938f)
                curveTo(6.1299f, 21.8464f, 5.6583f, 21.7857f, 5.4057f, 21.4574f)
                curveTo(5.1531f, 21.1292f, 5.2143f, 20.6585f, 5.5424f, 20.4058f)
                verticalLineTo(20.4058f)
                lineTo(5.5447f, 20.404f)
                lineTo(5.5544f, 20.3964f)
                lineTo(5.5954f, 20.3642f)
                curveTo(5.6318f, 20.3354f, 5.6853f, 20.2925f, 5.7518f, 20.2379f)
                curveTo(5.8852f, 20.1284f, 6.0691f, 19.9732f, 6.2704f, 19.7909f)
                curveTo(6.6869f, 19.4139f, 7.1258f, 18.9675f, 7.3718f, 18.5903f)
                curveTo(7.6061f, 18.2311f, 7.8319f, 17.6794f, 8.0067f, 17.1744f)
                curveTo(8.0912f, 16.9303f, 8.1588f, 16.7117f, 8.2052f, 16.5544f)
                curveTo(8.2284f, 16.476f, 8.2462f, 16.4133f, 8.2579f, 16.3708f)
                lineTo(8.271f, 16.3231f)
                lineTo(8.274f, 16.3117f)
                lineTo(8.2747f, 16.3094f)
                verticalLineTo(16.3094f)
                curveTo(8.38f, 15.9089f, 8.7901f, 15.6694f, 9.1907f, 15.7746f)
                close()
            }
        }
            .build()
        return _hikingMinimalistic!!
    }

private var _hikingMinimalistic: ImageVector? = null
