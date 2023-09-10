package com.chiksmedina.solar.boldduotone.money

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
import com.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.CardRecive: ImageVector
    get() {
        if (_cardRecive != null) {
            return _cardRecive!!
        }
        _cardRecive = Builder(
            name = "CardRecive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(14.6595f, 20.0f, 15.2613f, 20.0f, 15.8118f, 19.9937f)
                lineTo(15.409f, 19.591f)
                curveTo(14.5303f, 18.7123f, 14.5303f, 17.2877f, 15.409f, 16.409f)
                curveTo(15.7847f, 16.0334f, 16.2601f, 15.8183f, 16.75f, 15.7638f)
                verticalLineTo(14.0f)
                curveTo(16.75f, 12.7574f, 17.7574f, 11.75f, 19.0f, 11.75f)
                curveTo(20.2426f, 11.75f, 21.25f, 12.7574f, 21.25f, 14.0f)
                verticalLineTo(15.7638f)
                curveTo(21.4739f, 15.7887f, 21.6947f, 15.8471f, 21.9044f, 15.9391f)
                curveTo(22.0f, 14.9172f, 22.0f, 13.636f, 22.0f, 12.0f)
                curveTo(22.0f, 11.5581f, 22.0f, 10.392f, 21.9981f, 10.0f)
                horizontalLineTo(2.0019f)
                curveTo(2.0f, 10.392f, 2.0f, 11.5581f, 2.0f, 12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f, 20.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.4697f, 20.5303f)
                curveTo(18.7626f, 20.8232f, 19.2374f, 20.8232f, 19.5303f, 20.5303f)
                lineTo(21.5303f, 18.5303f)
                curveTo(21.8232f, 18.2374f, 21.8232f, 17.7626f, 21.5303f, 17.4697f)
                curveTo(21.2374f, 17.1768f, 20.7626f, 17.1768f, 20.4697f, 17.4697f)
                lineTo(19.75f, 18.1893f)
                verticalLineTo(14.0f)
                curveTo(19.75f, 13.5858f, 19.4142f, 13.25f, 19.0f, 13.25f)
                curveTo(18.5858f, 13.25f, 18.25f, 13.5858f, 18.25f, 14.0f)
                verticalLineTo(18.1893f)
                lineTo(17.5303f, 17.4697f)
                curveTo(17.2374f, 17.1768f, 16.7626f, 17.1768f, 16.4697f, 17.4697f)
                curveTo(16.1768f, 17.7626f, 16.1768f, 18.2374f, 16.4697f, 18.5303f)
                lineTo(18.4697f, 20.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.5f, 15.25f)
                curveTo(12.0858f, 15.25f, 11.75f, 15.5858f, 11.75f, 16.0f)
                curveTo(11.75f, 16.4142f, 12.0858f, 16.75f, 12.5f, 16.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 16.75f, 14.75f, 16.4142f, 14.75f, 16.0f)
                curveTo(14.75f, 15.5858f, 14.4142f, 15.25f, 14.0f, 15.25f)
                horizontalLineTo(12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 15.25f)
                curveTo(5.5858f, 15.25f, 5.25f, 15.5858f, 5.25f, 16.0f)
                curveTo(5.25f, 16.4142f, 5.5858f, 16.75f, 6.0f, 16.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 16.75f, 10.75f, 16.4142f, 10.75f, 16.0f)
                curveTo(10.75f, 15.5858f, 10.4142f, 15.25f, 10.0f, 15.25f)
                horizontalLineTo(6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.9948f, 4.0f)
                horizontalLineTo(14.0052f)
                curveTo(17.7861f, 4.0f, 19.6766f, 4.0f, 20.8512f, 5.1158f)
                curveTo(21.6969f, 5.9192f, 21.9337f, 7.0751f, 22.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                curveTo(2.0663f, 7.0751f, 2.3031f, 5.9192f, 3.1488f, 5.1158f)
                curveTo(4.3234f, 4.0f, 6.2139f, 4.0f, 9.9948f, 4.0f)
                close()
            }
        }
            .build()
        return _cardRecive!!
    }

private var _cardRecive: ImageVector? = null
