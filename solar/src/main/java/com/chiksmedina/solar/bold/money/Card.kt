package com.chiksmedina.solar.bold.money

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
import com.chiksmedina.solar.bold.MoneyGroup

val MoneyGroup.Card: ImageVector
    get() {
        if (_card != null) {
            return _card!!
        }
        _card = Builder(
            name = "Card", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 4.0f, 4.3432f, 4.0f, 3.1716f, 5.1716f)
                curveTo(2.328f, 6.0151f, 2.0919f, 7.2288f, 2.0257f, 9.25f)
                horizontalLineTo(21.9743f)
                curveTo(21.9082f, 7.2288f, 21.672f, 6.0151f, 20.8284f, 5.1716f)
                curveTo(19.6569f, 4.0f, 17.7712f, 4.0f, 14.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 20.0f, 19.6569f, 20.0f, 20.8284f, 18.8284f)
                curveTo(22.0f, 17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f)
                curveTo(22.0f, 11.5581f, 22.0f, 11.142f, 21.9981f, 10.75f)
                horizontalLineTo(2.0019f)
                curveTo(2.0f, 11.142f, 2.0f, 11.5581f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.25f, 16.0f)
                curveTo(5.25f, 15.5858f, 5.5858f, 15.25f, 6.0f, 15.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 15.25f, 10.75f, 15.5858f, 10.75f, 16.0f)
                curveTo(10.75f, 16.4142f, 10.4142f, 16.75f, 10.0f, 16.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 16.75f, 5.25f, 16.4142f, 5.25f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.75f, 16.0f)
                curveTo(11.75f, 15.5858f, 12.0858f, 15.25f, 12.5f, 15.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 15.25f, 14.75f, 15.5858f, 14.75f, 16.0f)
                curveTo(14.75f, 16.4142f, 14.4142f, 16.75f, 14.0f, 16.75f)
                horizontalLineTo(12.5f)
                curveTo(12.0858f, 16.75f, 11.75f, 16.4142f, 11.75f, 16.0f)
                close()
            }
        }
            .build()
        return _card!!
    }

private var _card: ImageVector? = null
