package dev.chiksmedina.solar.lineduotone.money

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
import dev.chiksmedina.solar.lineduotone.MoneyGroup

val MoneyGroup.BillList: ImageVector
    get() {
        if (_billList != null) {
            return _billList!!
        }
        _billList = Builder(
            name = "BillList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.755f, 2.0f)
                horizontalLineTo(7.245f)
                curveTo(6.0861f, 2.0f, 5.5067f, 2.0f, 5.0394f, 2.1626f)
                curveTo(4.1532f, 2.471f, 3.4575f, 3.1872f, 3.1579f, 4.0995f)
                curveTo(3.0f, 4.5806f, 3.0f, 5.1771f, 3.0f, 6.3701f)
                verticalLineTo(20.3742f)
                curveTo(3.0f, 21.2324f, 3.985f, 21.6878f, 4.6081f, 21.1176f)
                curveTo(4.9742f, 20.7826f, 5.5258f, 20.7826f, 5.8919f, 21.1176f)
                lineTo(6.375f, 21.5597f)
                curveTo(7.0166f, 22.1468f, 7.9834f, 22.1468f, 8.625f, 21.5597f)
                curveTo(9.2666f, 20.9726f, 10.2334f, 20.9726f, 10.875f, 21.5597f)
                curveTo(11.5166f, 22.1468f, 12.4834f, 22.1468f, 13.125f, 21.5597f)
                curveTo(13.7666f, 20.9726f, 14.7334f, 20.9726f, 15.375f, 21.5597f)
                curveTo(16.0166f, 22.1468f, 16.9834f, 22.1468f, 17.625f, 21.5597f)
                lineTo(18.1081f, 21.1176f)
                curveTo(18.4742f, 20.7826f, 19.0258f, 20.7826f, 19.3919f, 21.1176f)
                curveTo(20.015f, 21.6878f, 21.0f, 21.2324f, 21.0f, 20.3742f)
                verticalLineTo(6.3701f)
                curveTo(21.0f, 5.1771f, 21.0f, 4.5806f, 20.842f, 4.0995f)
                curveTo(20.5425f, 3.1872f, 19.8468f, 2.471f, 18.9606f, 2.1626f)
                curveTo(18.4933f, 2.0f, 17.9139f, 2.0f, 16.755f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 11.0f)
                lineTo(17.0f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 11.0f)
                horizontalLineTo(7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 7.5f)
                horizontalLineTo(7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 14.5f)
                horizontalLineTo(7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 7.5f)
                horizontalLineTo(17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5f, 14.5f)
                horizontalLineTo(17.0f)
            }
        }
            .build()
        return _billList!!
    }

private var _billList: ImageVector? = null
