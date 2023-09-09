package com.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MoneyGroup

public val MoneyGroup.CashOut: ImageVector
    get() {
        if (_cashOut != null) {
            return _cashOut!!
        }
        _cashOut = Builder(name = "CashOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.25f, 7.0204f)
                curveTo(1.25f, 4.4095f, 3.3036f, 2.25f, 5.8889f, 2.25f)
                horizontalLineTo(18.1111f)
                curveTo(20.6964f, 2.25f, 22.75f, 4.4095f, 22.75f, 7.0204f)
                curveTo(22.75f, 9.0483f, 21.5139f, 10.8004f, 19.75f, 11.4846f)
                verticalLineTo(16.052f)
                curveTo(19.75f, 16.3624f, 19.75f, 16.655f, 19.7467f, 16.9295f)
                curveTo(19.7489f, 16.9527f, 19.75f, 16.9762f, 19.75f, 17.0f)
                curveTo(19.75f, 17.0314f, 19.7481f, 17.0623f, 19.7443f, 17.0927f)
                curveTo(19.7363f, 17.5455f, 19.7169f, 17.9464f, 19.6701f, 18.2945f)
                curveTo(19.5857f, 18.9223f, 19.4f, 19.4891f, 18.9445f, 19.9445f)
                curveTo(18.4891f, 20.4f, 17.9223f, 20.5857f, 17.2945f, 20.6701f)
                curveTo(16.6997f, 20.7501f, 15.9505f, 20.75f, 15.052f, 20.75f)
                horizontalLineTo(8.948f)
                curveTo(8.0495f, 20.75f, 7.3003f, 20.7501f, 6.7055f, 20.6701f)
                curveTo(6.0777f, 20.5857f, 5.5109f, 20.4f, 5.0555f, 19.9445f)
                curveTo(4.6f, 19.4891f, 4.4143f, 18.9223f, 4.3299f, 18.2945f)
                curveTo(4.2831f, 17.9464f, 4.2637f, 17.5455f, 4.2557f, 17.0927f)
                curveTo(4.2519f, 17.0623f, 4.25f, 17.0314f, 4.25f, 17.0f)
                curveTo(4.25f, 16.9762f, 4.2511f, 16.9527f, 4.2533f, 16.9295f)
                curveTo(4.25f, 16.655f, 4.25f, 16.3624f, 4.25f, 16.052f)
                lineTo(4.25f, 11.4846f)
                curveTo(2.4861f, 10.8004f, 1.25f, 9.0483f, 1.25f, 7.0204f)
                close()
                moveTo(4.25f, 9.8096f)
                curveTo(4.2502f, 8.9723f, 4.2541f, 8.2695f, 4.3299f, 7.7055f)
                curveTo(4.4143f, 7.0777f, 4.6f, 6.5109f, 5.0555f, 6.0555f)
                curveTo(5.5109f, 5.6f, 6.0777f, 5.4143f, 6.7055f, 5.3299f)
                curveTo(7.3003f, 5.2499f, 8.0495f, 5.25f, 8.948f, 5.25f)
                horizontalLineTo(15.052f)
                curveTo(15.9505f, 5.25f, 16.6997f, 5.2499f, 17.2945f, 5.3299f)
                curveTo(17.9223f, 5.4143f, 18.4891f, 5.6f, 18.9445f, 6.0555f)
                curveTo(19.4f, 6.5109f, 19.5857f, 7.0777f, 19.6701f, 7.7055f)
                curveTo(19.7459f, 8.2695f, 19.7498f, 8.9723f, 19.75f, 9.8095f)
                curveTo(20.6439f, 9.238f, 21.25f, 8.2103f, 21.25f, 7.0204f)
                curveTo(21.25f, 5.1905f, 19.8214f, 3.75f, 18.1111f, 3.75f)
                horizontalLineTo(5.8889f)
                curveTo(4.1786f, 3.75f, 2.75f, 5.1905f, 2.75f, 7.0204f)
                curveTo(2.75f, 8.2103f, 3.3561f, 9.238f, 4.25f, 9.8096f)
                close()
                moveTo(11.25f, 6.75f)
                horizontalLineTo(9.0f)
                curveTo(8.036f, 6.75f, 7.3884f, 6.7516f, 6.9054f, 6.8165f)
                curveTo(6.4439f, 6.8786f, 6.2464f, 6.9858f, 6.1161f, 7.1161f)
                curveTo(5.9858f, 7.2464f, 5.8786f, 7.4439f, 5.8165f, 7.9054f)
                curveTo(5.7516f, 8.3884f, 5.75f, 9.036f, 5.75f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(5.75f, 16.0858f, 5.75f, 16.1691f, 5.7501f, 16.25f)
                horizontalLineTo(18.2499f)
                curveTo(18.25f, 16.1691f, 18.25f, 16.0858f, 18.25f, 16.0f)
                verticalLineTo(10.0f)
                curveTo(18.25f, 9.036f, 18.2484f, 8.3884f, 18.1835f, 7.9054f)
                curveTo(18.1214f, 7.4439f, 18.0142f, 7.2464f, 17.8839f, 7.1161f)
                curveTo(17.7536f, 6.9858f, 17.5561f, 6.8786f, 17.0946f, 6.8165f)
                curveTo(16.6116f, 6.7516f, 15.964f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.9726f)
                lineTo(13.4306f, 10.1786f)
                curveTo(13.7001f, 9.8641f, 14.1736f, 9.8277f, 14.4881f, 10.0972f)
                curveTo(14.8026f, 10.3668f, 14.839f, 10.8403f, 14.5694f, 11.1548f)
                lineTo(12.5694f, 13.4881f)
                curveTo(12.427f, 13.6543f, 12.2189f, 13.75f, 12.0f, 13.75f)
                curveTo(11.7811f, 13.75f, 11.573f, 13.6543f, 11.4306f, 13.4881f)
                lineTo(9.4306f, 11.1548f)
                curveTo(9.161f, 10.8403f, 9.1974f, 10.3668f, 9.5119f, 10.0972f)
                curveTo(9.8264f, 9.8277f, 10.2999f, 9.8641f, 10.5694f, 10.1786f)
                lineTo(11.25f, 10.9726f)
                verticalLineTo(6.75f)
                close()
                moveTo(18.2178f, 17.75f)
                horizontalLineTo(5.7822f)
                curveTo(5.791f, 17.8739f, 5.8022f, 17.9883f, 5.8165f, 18.0946f)
                curveTo(5.8786f, 18.5561f, 5.9858f, 18.7536f, 6.1161f, 18.8839f)
                curveTo(6.2464f, 19.0142f, 6.4439f, 19.1214f, 6.9054f, 19.1835f)
                curveTo(7.3884f, 19.2484f, 8.036f, 19.25f, 9.0f, 19.25f)
                horizontalLineTo(15.0f)
                curveTo(15.964f, 19.25f, 16.6116f, 19.2484f, 17.0946f, 19.1835f)
                curveTo(17.5561f, 19.1214f, 17.7536f, 19.0142f, 17.8839f, 18.8839f)
                curveTo(18.0142f, 18.7536f, 18.1214f, 18.5561f, 18.1835f, 18.0946f)
                curveTo(18.1978f, 17.9883f, 18.209f, 17.8739f, 18.2178f, 17.75f)
                close()
            }
        }
        .build()
        return _cashOut!!
    }

private var _cashOut: ImageVector? = null
