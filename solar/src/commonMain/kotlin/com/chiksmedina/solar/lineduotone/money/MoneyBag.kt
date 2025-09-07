package com.chiksmedina.solar.lineduotone.money

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
import com.chiksmedina.solar.lineduotone.MoneyGroup

val MoneyGroup.MoneyBag: ImageVector
    get() {
        if (_moneyBag != null) {
            return _moneyBag!!
        }
        _moneyBag = Builder(
            name = "MoneyBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(4.3432f, 6.0f, 6.2288f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 6.0f, 19.6569f, 6.0f, 20.8284f, 7.1716f)
                curveTo(22.0f, 8.3432f, 22.0f, 10.2288f, 22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 6.0f)
                curveTo(16.0f, 4.1144f, 16.0f, 3.1716f, 15.4142f, 2.5858f)
                curveTo(14.8284f, 2.0f, 13.8856f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1144f, 2.0f, 9.1716f, 2.0f, 8.5858f, 2.5858f)
                curveTo(8.0f, 3.1716f, 8.0f, 4.1144f, 8.0f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 17.3333f)
                curveTo(13.1046f, 17.3333f, 14.0f, 16.5871f, 14.0f, 15.6667f)
                curveTo(14.0f, 14.7462f, 13.1046f, 14.0f, 12.0f, 14.0f)
                curveTo(10.8954f, 14.0f, 10.0f, 13.2538f, 10.0f, 12.3333f)
                curveTo(10.0f, 11.4129f, 10.8954f, 10.6667f, 12.0f, 10.6667f)
                moveTo(12.0f, 17.3333f)
                curveTo(10.8954f, 17.3333f, 10.0f, 16.5871f, 10.0f, 15.6667f)
                moveTo(12.0f, 17.3333f)
                verticalLineTo(18.0f)
                moveTo(12.0f, 10.0f)
                verticalLineTo(10.6667f)
                moveTo(12.0f, 10.6667f)
                curveTo(13.1046f, 10.6667f, 14.0f, 11.4129f, 14.0f, 12.3333f)
            }
        }
            .build()
        return _moneyBag!!
    }

private var _moneyBag: ImageVector? = null
