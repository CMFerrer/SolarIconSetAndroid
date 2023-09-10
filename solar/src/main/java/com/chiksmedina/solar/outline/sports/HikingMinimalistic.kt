package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(11.5f, 3.75f)
                curveTo(10.5335f, 3.75f, 9.75f, 4.5335f, 9.75f, 5.5f)
                curveTo(9.75f, 6.4665f, 10.5335f, 7.25f, 11.5f, 7.25f)
                curveTo(12.4665f, 7.25f, 13.25f, 6.4665f, 13.25f, 5.5f)
                curveTo(13.25f, 4.5335f, 12.4665f, 3.75f, 11.5f, 3.75f)
                close()
                moveTo(8.25f, 5.5f)
                curveTo(8.25f, 3.7051f, 9.7051f, 2.25f, 11.5f, 2.25f)
                curveTo(13.2949f, 2.25f, 14.75f, 3.7051f, 14.75f, 5.5f)
                curveTo(14.75f, 7.2949f, 13.2949f, 8.75f, 11.5f, 8.75f)
                curveTo(9.7051f, 8.75f, 8.25f, 7.2949f, 8.25f, 5.5f)
                close()
                moveTo(19.0f, 6.25f)
                curveTo(19.4142f, 6.25f, 19.75f, 6.5858f, 19.75f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(19.75f, 21.4142f, 19.4142f, 21.75f, 19.0f, 21.75f)
                curveTo(18.5858f, 21.75f, 18.25f, 21.4142f, 18.25f, 21.0f)
                verticalLineTo(10.9941f)
                curveTo(16.5564f, 11.9799f, 14.456f, 12.0665f, 12.6645f, 11.1708f)
                curveTo(12.6474f, 11.1622f, 12.6305f, 11.153f, 12.6141f, 11.1431f)
                curveTo(11.9233f, 10.7287f, 11.0363f, 11.1741f, 10.9561f, 11.9756f)
                lineTo(10.8875f, 12.6617f)
                curveTo(10.8294f, 13.243f, 11.1062f, 13.807f, 11.6016f, 14.1166f)
                lineTo(11.9348f, 14.3249f)
                curveTo(13.6852f, 15.4188f, 14.8214f, 17.2701f, 15.0044f, 19.3261f)
                lineTo(15.1474f, 20.9335f)
                curveTo(15.1841f, 21.3461f, 14.8794f, 21.7103f, 14.4668f, 21.747f)
                curveTo(14.0542f, 21.7838f, 13.69f, 21.4791f, 13.6533f, 21.0665f)
                lineTo(13.5103f, 19.4591f)
                curveTo(13.369f, 17.8713f, 12.4915f, 16.4417f, 11.1398f, 15.5969f)
                lineTo(10.8066f, 15.3886f)
                curveTo(9.8272f, 14.7765f, 9.28f, 13.6616f, 9.395f, 12.5125f)
                lineTo(9.4636f, 11.8264f)
                curveTo(9.6521f, 9.9409f, 11.7281f, 8.8883f, 13.3581f, 9.8404f)
                curveTo(14.9094f, 10.605f, 16.7666f, 10.3848f, 18.0965f, 9.2766f)
                lineTo(18.25f, 9.1487f)
                verticalLineTo(7.0f)
                curveTo(18.25f, 6.5858f, 18.5858f, 6.25f, 19.0f, 6.25f)
                close()
                moveTo(9.1906f, 15.7746f)
                curveTo(9.5912f, 15.8799f, 9.8306f, 16.29f, 9.7253f, 16.6906f)
                lineTo(9.0f, 16.5f)
                curveTo(9.7253f, 16.6906f, 9.7254f, 16.6906f, 9.7253f, 16.6906f)
                lineTo(9.7247f, 16.693f)
                lineTo(9.7235f, 16.6976f)
                lineTo(9.7192f, 16.7137f)
                lineTo(9.7033f, 16.7718f)
                curveTo(9.6895f, 16.8213f, 9.6695f, 16.892f, 9.6438f, 16.9791f)
                curveTo(9.5925f, 17.153f, 9.5178f, 17.3942f, 9.4241f, 17.665f)
                curveTo(9.2425f, 18.1898f, 8.9683f, 18.8881f, 8.6282f, 19.4097f)
                curveTo(8.2708f, 19.9577f, 7.7097f, 20.5113f, 7.277f, 20.903f)
                curveTo(7.0538f, 21.1051f, 6.8509f, 21.2763f, 6.7035f, 21.3973f)
                curveTo(6.6297f, 21.4579f, 6.5694f, 21.5062f, 6.527f, 21.5398f)
                lineTo(6.4772f, 21.579f)
                lineTo(6.4634f, 21.5897f)
                lineTo(6.4594f, 21.5928f)
                lineTo(6.4581f, 21.5938f)
                curveTo(6.4581f, 21.5939f, 6.4574f, 21.5944f, 6.0f, 21.0f)
                lineTo(6.4581f, 21.5938f)
                curveTo(6.1299f, 21.8464f, 5.6582f, 21.7857f, 5.4056f, 21.4574f)
                curveTo(5.153f, 21.1292f, 5.2143f, 20.6584f, 5.5424f, 20.4058f)
                curveTo(5.5424f, 20.4058f, 5.5423f, 20.4058f, 5.5424f, 20.4058f)
                lineTo(5.5446f, 20.404f)
                lineTo(5.5544f, 20.3964f)
                lineTo(5.5954f, 20.3642f)
                curveTo(5.6317f, 20.3354f, 5.6852f, 20.2925f, 5.7518f, 20.2379f)
                curveTo(5.8851f, 20.1284f, 6.069f, 19.9732f, 6.2704f, 19.7909f)
                curveTo(6.6868f, 19.4139f, 7.1258f, 18.9675f, 7.3718f, 18.5903f)
                curveTo(7.606f, 18.2311f, 7.8319f, 17.6794f, 8.0066f, 17.1744f)
                curveTo(8.0911f, 16.9303f, 8.1588f, 16.7117f, 8.2052f, 16.5544f)
                curveTo(8.2283f, 16.476f, 8.2461f, 16.4133f, 8.2579f, 16.3708f)
                lineTo(8.2709f, 16.3231f)
                lineTo(8.274f, 16.3117f)
                lineTo(8.2746f, 16.3094f)
                curveTo(8.2746f, 16.3094f, 8.2746f, 16.3094f, 8.2746f, 16.3094f)
                curveTo(8.38f, 15.9089f, 8.7901f, 15.6694f, 9.1906f, 15.7746f)
                close()
            }
        }
            .build()
        return _hikingMinimalistic!!
    }

private var _hikingMinimalistic: ImageVector? = null
