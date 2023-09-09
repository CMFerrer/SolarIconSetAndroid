package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.Banknote: ImageVector
    get() {
        if (_banknote != null) {
            return _banknote!!
        }
        _banknote = Builder(name = "Banknote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                curveTo(13.2426f, 14.25f, 14.25f, 13.2426f, 14.25f, 12.0f)
                curveTo(14.25f, 10.7574f, 13.2426f, 9.75f, 12.0f, 9.75f)
                curveTo(10.7574f, 9.75f, 9.75f, 10.7574f, 9.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.7777f, 18.3259f)
                curveTo(4.7866f, 19.0f, 6.1911f, 19.0f, 9.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                curveTo(17.8089f, 19.0f, 19.2134f, 19.0f, 20.2223f, 18.3259f)
                curveTo(20.659f, 18.034f, 21.034f, 17.659f, 21.3259f, 17.2223f)
                curveTo(22.0f, 16.2134f, 22.0f, 14.8089f, 22.0f, 12.0f)
                curveTo(22.0f, 9.1911f, 22.0f, 7.7866f, 21.3259f, 6.7777f)
                curveTo(21.034f, 6.341f, 20.659f, 5.966f, 20.2223f, 5.6741f)
                curveTo(19.2134f, 5.0f, 17.8089f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(6.1911f, 5.0f, 4.7866f, 5.0f, 3.7777f, 5.6741f)
                curveTo(3.341f, 5.966f, 2.966f, 6.341f, 2.6741f, 6.7777f)
                curveTo(2.0f, 7.7866f, 2.0f, 9.1911f, 2.0f, 12.0f)
                curveTo(2.0f, 14.8089f, 2.0f, 16.2134f, 2.6741f, 17.2223f)
                curveTo(2.966f, 17.659f, 3.341f, 18.034f, 3.7777f, 18.3259f)
                close()
                moveTo(12.0f, 15.75f)
                curveTo(9.9289f, 15.75f, 8.25f, 14.0711f, 8.25f, 12.0f)
                curveTo(8.25f, 9.9289f, 9.9289f, 8.25f, 12.0f, 8.25f)
                curveTo(14.0711f, 8.25f, 15.75f, 9.9289f, 15.75f, 12.0f)
                curveTo(15.75f, 14.0711f, 14.0711f, 15.75f, 12.0f, 15.75f)
                close()
                moveTo(5.5f, 15.75f)
                curveTo(5.0858f, 15.75f, 4.75f, 15.4142f, 4.75f, 15.0f)
                lineTo(4.75f, 9.0f)
                curveTo(4.75f, 8.5858f, 5.0858f, 8.25f, 5.5f, 8.25f)
                curveTo(5.9142f, 8.25f, 6.25f, 8.5858f, 6.25f, 9.0f)
                lineTo(6.25f, 15.0f)
                curveTo(6.25f, 15.4142f, 5.9142f, 15.75f, 5.5f, 15.75f)
                close()
                moveTo(17.75f, 15.0f)
                curveTo(17.75f, 15.4142f, 18.0858f, 15.75f, 18.5f, 15.75f)
                curveTo(18.9142f, 15.75f, 19.25f, 15.4142f, 19.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(19.25f, 8.5858f, 18.9142f, 8.25f, 18.5f, 8.25f)
                curveTo(18.0858f, 8.25f, 17.75f, 8.5858f, 17.75f, 9.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _banknote!!
    }

private var _banknote: ImageVector? = null
