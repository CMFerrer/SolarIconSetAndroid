package dev.chiksmedina.solar.broken.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MoneyGroup

val MoneyGroup.BillCheck: ImageVector
    get() {
        if (_billCheck != null) {
            return _billCheck!!
        }
        _billCheck = Builder(
            name = "BillCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 7.0f)
                verticalLineTo(6.3701f)
                curveTo(21.0f, 5.1771f, 21.0f, 4.5806f, 20.842f, 4.0995f)
                curveTo(20.5425f, 3.1872f, 19.8468f, 2.471f, 18.9606f, 2.1626f)
                curveTo(18.4933f, 2.0f, 17.9139f, 2.0f, 16.755f, 2.0f)
                horizontalLineTo(7.245f)
                curveTo(6.0861f, 2.0f, 5.5067f, 2.0f, 5.0394f, 2.1626f)
                curveTo(4.1532f, 2.471f, 3.4575f, 3.1872f, 3.1579f, 4.0995f)
                curveTo(3.0f, 4.5806f, 3.0f, 5.1771f, 3.0f, 6.3701f)
                verticalLineTo(15.0f)
                moveTo(21.0f, 11.0f)
                verticalLineTo(20.3742f)
                curveTo(21.0f, 21.2324f, 20.015f, 21.6878f, 19.3919f, 21.1176f)
                curveTo(19.0258f, 20.7826f, 18.4742f, 20.7826f, 18.1081f, 21.1176f)
                lineTo(17.625f, 21.5597f)
                curveTo(16.9834f, 22.1468f, 16.0166f, 22.1468f, 15.375f, 21.5597f)
                curveTo(14.7334f, 20.9726f, 13.7666f, 20.9726f, 13.125f, 21.5597f)
                curveTo(12.4834f, 22.1468f, 11.5166f, 22.1468f, 10.875f, 21.5597f)
                curveTo(10.2334f, 20.9726f, 9.2666f, 20.9726f, 8.625f, 21.5597f)
                curveTo(7.9834f, 22.1468f, 7.0166f, 22.1468f, 6.375f, 21.5597f)
                lineTo(5.8919f, 21.1176f)
                curveTo(5.5258f, 20.7826f, 4.9742f, 20.7826f, 4.6081f, 21.1176f)
                curveTo(3.985f, 21.6878f, 3.0f, 21.2324f, 3.0f, 20.3742f)
                verticalLineTo(19.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 10.4f)
                lineTo(10.9286f, 12.0f)
                lineTo(14.5f, 8.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 15.5f)
                horizontalLineTo(9.0f)
                moveTo(16.5f, 15.5f)
                horizontalLineTo(12.0f)
            }
        }
            .build()
        return _billCheck!!
    }

private var _billCheck: ImageVector? = null
