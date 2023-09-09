package com.chiksmedina.solar.lineduotone.shoppingecommerce

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
import com.chiksmedina.solar.lineduotone.ShoppingEcommerceGroup

public val ShoppingEcommerceGroup.CartLarge: ImageVector
    get() {
        if (_cartLarge != null) {
            return _cartLarge!!
        }
        _cartLarge = Builder(name = "CartLarge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                lineTo(2.2649f, 3.0883f)
                curveTo(3.5849f, 3.5283f, 4.245f, 3.7483f, 4.6225f, 4.2721f)
                curveTo(5.0f, 4.7959f, 5.0f, 5.4916f, 5.0f, 6.883f)
                verticalLineTo(9.5f)
                curveTo(5.0f, 12.3284f, 5.0f, 13.7426f, 5.8787f, 14.6213f)
                curveTo(6.7574f, 15.5f, 8.1716f, 15.5f, 11.0f, 15.5f)
                horizontalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 18.0f)
                curveTo(8.3284f, 18.0f, 9.0f, 18.6716f, 9.0f, 19.5f)
                curveTo(9.0f, 20.3284f, 8.3284f, 21.0f, 7.5f, 21.0f)
                curveTo(6.6716f, 21.0f, 6.0f, 20.3284f, 6.0f, 19.5f)
                curveTo(6.0f, 18.6716f, 6.6716f, 18.0f, 7.5f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 18.0001f)
                curveTo(17.3284f, 18.0001f, 18.0f, 18.6716f, 18.0f, 19.5001f)
                curveTo(18.0f, 20.3285f, 17.3284f, 21.0001f, 16.5f, 21.0001f)
                curveTo(15.6716f, 21.0001f, 15.0f, 20.3285f, 15.0f, 19.5001f)
                curveTo(15.0f, 18.6716f, 15.6716f, 18.0001f, 16.5f, 18.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                horizontalLineTo(16.4504f)
                curveTo(18.5054f, 6.0f, 19.5328f, 6.0f, 19.9775f, 6.6743f)
                curveTo(20.4221f, 7.3485f, 20.0173f, 8.2929f, 19.2078f, 10.1818f)
                lineTo(18.7792f, 11.1818f)
                curveTo(18.4013f, 12.0636f, 18.2123f, 12.5045f, 17.8366f, 12.7523f)
                curveTo(17.4609f, 13.0f, 16.9812f, 13.0f, 16.0218f, 13.0f)
                horizontalLineTo(5.0f)
            }
        }
        .build()
        return _cartLarge!!
    }

private var _cartLarge: ImageVector? = null
