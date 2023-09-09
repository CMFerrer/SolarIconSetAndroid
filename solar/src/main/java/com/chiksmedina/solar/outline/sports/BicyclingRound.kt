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

public val SportsGroup.BicyclingRound: ImageVector
    get() {
        if (_bicyclingRound != null) {
            return _bicyclingRound!!
        }
        _bicyclingRound = Builder(name = "BicyclingRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 2.75f)
                curveTo(13.3096f, 2.75f, 12.75f, 3.3096f, 12.75f, 4.0f)
                curveTo(12.75f, 4.6904f, 13.3096f, 5.25f, 14.0f, 5.25f)
                curveTo(14.6904f, 5.25f, 15.25f, 4.6904f, 15.25f, 4.0f)
                curveTo(15.25f, 3.3096f, 14.6904f, 2.75f, 14.0f, 2.75f)
                close()
                moveTo(11.25f, 4.0f)
                curveTo(11.25f, 2.4812f, 12.4812f, 1.25f, 14.0f, 1.25f)
                curveTo(15.5188f, 1.25f, 16.75f, 2.4812f, 16.75f, 4.0f)
                curveTo(16.75f, 5.5188f, 15.5188f, 6.75f, 14.0f, 6.75f)
                curveTo(12.4812f, 6.75f, 11.25f, 5.5188f, 11.25f, 4.0f)
                close()
                moveTo(10.919f, 8.506f)
                curveTo(10.0125f, 7.7843f, 8.6759f, 8.0421f, 8.1027f, 9.0491f)
                curveTo(7.5479f, 10.0238f, 7.9604f, 11.2644f, 8.9883f, 11.713f)
                lineTo(12.079f, 13.0616f)
                curveTo(13.4092f, 13.6421f, 14.0214f, 15.1873f, 13.4497f, 16.5213f)
                lineTo(12.6894f, 18.2954f)
                curveTo(12.5262f, 18.6762f, 12.0853f, 18.8525f, 11.7046f, 18.6894f)
                curveTo(11.3238f, 18.5262f, 11.1475f, 18.0853f, 11.3106f, 17.7046f)
                lineTo(12.071f, 15.9304f)
                curveTo(12.3179f, 15.3544f, 12.0535f, 14.6871f, 11.4791f, 14.4364f)
                lineTo(8.3884f, 13.0878f)
                curveTo(6.5436f, 12.2828f, 5.8035f, 10.0564f, 6.7991f, 8.3071f)
                curveTo(7.8277f, 6.5f, 10.2264f, 6.0374f, 11.8532f, 7.3324f)
                lineTo(14.0116f, 9.0506f)
                curveTo(14.1738f, 9.1797f, 14.375f, 9.25f, 14.5823f, 9.25f)
                horizontalLineTo(18.5f)
                curveTo(18.9142f, 9.25f, 19.25f, 9.5858f, 19.25f, 10.0f)
                curveTo(19.25f, 10.4142f, 18.9142f, 10.75f, 18.5f, 10.75f)
                horizontalLineTo(14.5823f)
                curveTo(14.0356f, 10.75f, 13.5051f, 10.5646f, 13.0773f, 10.2241f)
                lineTo(10.919f, 8.506f)
                close()
                moveTo(6.0f, 15.75f)
                curveTo(4.7574f, 15.75f, 3.75f, 16.7574f, 3.75f, 18.0f)
                curveTo(3.75f, 19.2426f, 4.7574f, 20.25f, 6.0f, 20.25f)
                curveTo(7.2426f, 20.25f, 8.25f, 19.2426f, 8.25f, 18.0f)
                curveTo(8.25f, 16.7574f, 7.2426f, 15.75f, 6.0f, 15.75f)
                close()
                moveTo(2.25f, 18.0f)
                curveTo(2.25f, 15.9289f, 3.9289f, 14.25f, 6.0f, 14.25f)
                curveTo(8.0711f, 14.25f, 9.75f, 15.9289f, 9.75f, 18.0f)
                curveTo(9.75f, 20.0711f, 8.0711f, 21.75f, 6.0f, 21.75f)
                curveTo(3.9289f, 21.75f, 2.25f, 20.0711f, 2.25f, 18.0f)
                close()
                moveTo(18.0f, 15.75f)
                curveTo(16.7574f, 15.75f, 15.75f, 16.7574f, 15.75f, 18.0f)
                curveTo(15.75f, 19.2426f, 16.7574f, 20.25f, 18.0f, 20.25f)
                curveTo(19.2426f, 20.25f, 20.25f, 19.2426f, 20.25f, 18.0f)
                curveTo(20.25f, 16.7574f, 19.2426f, 15.75f, 18.0f, 15.75f)
                close()
                moveTo(14.25f, 18.0f)
                curveTo(14.25f, 15.9289f, 15.9289f, 14.25f, 18.0f, 14.25f)
                curveTo(20.0711f, 14.25f, 21.75f, 15.9289f, 21.75f, 18.0f)
                curveTo(21.75f, 20.0711f, 20.0711f, 21.75f, 18.0f, 21.75f)
                curveTo(15.9289f, 21.75f, 14.25f, 20.0711f, 14.25f, 18.0f)
                close()
            }
        }
        .build()
        return _bicyclingRound!!
    }

private var _bicyclingRound: ImageVector? = null
