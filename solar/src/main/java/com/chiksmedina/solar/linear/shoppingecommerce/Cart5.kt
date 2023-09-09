package com.chiksmedina.solar.linear.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ShoppingEcommerceGroup

public val ShoppingEcommerceGroup.Cart5: ImageVector
    get() {
        if (_cart5 != null) {
            return _cart5!!
        }
        _cart5 = Builder(name = "Cart5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5551f, 14.2572f)
                curveTo(2.8366f, 10.9043f, 2.4774f, 9.2279f, 3.3779f, 8.114f)
                curveTo(4.2785f, 7.0f, 5.993f, 7.0f, 9.4219f, 7.0f)
                horizontalLineTo(14.578f)
                curveTo(18.007f, 7.0f, 19.7215f, 7.0f, 20.622f, 8.114f)
                curveTo(21.5226f, 9.2279f, 21.1633f, 10.9043f, 20.4449f, 14.2572f)
                lineTo(20.0163f, 16.2572f)
                curveTo(19.5293f, 18.5297f, 19.2858f, 19.666f, 18.4608f, 20.333f)
                curveTo(17.6357f, 21.0f, 16.4736f, 21.0f, 14.1495f, 21.0f)
                horizontalLineTo(9.8505f)
                curveTo(7.5263f, 21.0f, 6.3643f, 21.0f, 5.5392f, 20.333f)
                curveTo(4.7141f, 19.666f, 4.4706f, 18.5297f, 3.9836f, 16.2572f)
                lineTo(3.5551f, 14.2572f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                lineTo(15.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                lineTo(9.0f, 3.0f)
            }
        }
        .build()
        return _cart5!!
    }

private var _cart5: ImageVector? = null
