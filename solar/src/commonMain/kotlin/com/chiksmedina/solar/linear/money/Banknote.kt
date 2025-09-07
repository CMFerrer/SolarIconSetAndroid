package com.chiksmedina.solar.linear.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MoneyGroup

val MoneyGroup.Banknote: ImageVector
    get() {
        if (_banknote != null) {
            return _banknote!!
        }
        _banknote = Builder(
            name = "Banknote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 19.0f)
                curveTo(6.1911f, 19.0f, 4.7866f, 19.0f, 3.7777f, 18.3259f)
                curveTo(3.341f, 18.034f, 2.966f, 17.659f, 2.6741f, 17.2223f)
                curveTo(2.0f, 16.2134f, 2.0f, 14.8089f, 2.0f, 12.0f)
                curveTo(2.0f, 9.1911f, 2.0f, 7.7866f, 2.6741f, 6.7777f)
                curveTo(2.966f, 6.341f, 3.341f, 5.966f, 3.7777f, 5.6741f)
                curveTo(4.7866f, 5.0f, 6.1911f, 5.0f, 9.0f, 5.0f)
                lineTo(15.0f, 5.0f)
                curveTo(17.8089f, 5.0f, 19.2134f, 5.0f, 20.2223f, 5.6741f)
                curveTo(20.659f, 5.966f, 21.034f, 6.341f, 21.3259f, 6.7777f)
                curveTo(22.0f, 7.7866f, 22.0f, 9.1911f, 22.0f, 12.0f)
                curveTo(22.0f, 14.8089f, 22.0f, 16.2134f, 21.3259f, 17.2223f)
                curveTo(21.034f, 17.659f, 20.659f, 18.034f, 20.2223f, 18.3259f)
                curveTo(19.2134f, 19.0f, 17.8089f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 13.6569f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.5f, 15.0f)
                lineTo(5.5f, 9.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5f, 15.0f)
                lineTo(18.5f, 9.0f)
            }
        }
            .build()
        return _banknote!!
    }

private var _banknote: ImageVector? = null
