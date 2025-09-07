package com.chiksmedina.solar.boldduotone.shoppingecommerce

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
import com.chiksmedina.solar.boldduotone.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Cart4: ImageVector
    get() {
        if (_cart4 != null) {
            return _cart4!!
        }
        _cart4 = Builder(
            name = "Cart4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0452f, 11.75f)
                curveTo(3.171f, 12.4643f, 3.3482f, 13.2912f, 3.5552f, 14.2572f)
                lineTo(3.9837f, 16.2572f)
                curveTo(4.4707f, 18.5297f, 4.7142f, 19.666f, 5.5393f, 20.333f)
                curveTo(6.3643f, 21.0f, 7.5264f, 21.0f, 9.8506f, 21.0f)
                horizontalLineTo(14.1496f)
                curveTo(16.4737f, 21.0f, 17.6358f, 21.0f, 18.4608f, 20.333f)
                curveTo(19.2859f, 19.666f, 19.5294f, 18.5297f, 20.0164f, 16.2572f)
                lineTo(20.445f, 14.2572f)
                curveTo(20.652f, 13.2912f, 20.8291f, 12.4643f, 20.955f, 11.75f)
                horizontalLineTo(3.0452f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.25f, 14.0f)
                curveTo(9.25f, 13.5858f, 9.5858f, 13.25f, 10.0f, 13.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 13.25f, 14.75f, 13.5858f, 14.75f, 14.0f)
                curveTo(14.75f, 14.4142f, 14.4142f, 14.75f, 14.0f, 14.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 14.75f, 9.25f, 14.4142f, 9.25f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.3293f, 2.6648f)
                curveTo(8.5146f, 2.2943f, 8.9651f, 2.1441f, 9.3356f, 2.3293f)
                curveTo(9.7061f, 2.5146f, 9.8562f, 2.9651f, 9.671f, 3.3356f)
                lineTo(7.8361f, 7.0054f)
                curveTo(8.3192f, 7.0002f, 8.8464f, 7.0002f, 9.422f, 7.0002f)
                horizontalLineTo(14.5781f)
                curveTo(15.1537f, 7.0002f, 15.681f, 7.0002f, 16.1643f, 7.0054f)
                lineTo(14.3293f, 3.3356f)
                curveTo(14.1441f, 2.9651f, 14.2943f, 2.5146f, 14.6648f, 2.3293f)
                curveTo(15.0352f, 2.1441f, 15.4857f, 2.2943f, 15.671f, 2.6648f)
                lineTo(17.8721f, 7.0671f)
                curveTo(19.2252f, 7.171f, 20.0742f, 7.4365f, 20.6221f, 8.1141f)
                curveTo(21.0575f, 8.6527f, 21.1984f, 9.3227f, 21.1466f, 10.2502f)
                horizontalLineTo(21.0002f)
                curveTo(21.0501f, 10.2502f, 21.0989f, 10.255f, 21.146f, 10.2643f)
                curveTo(21.1209f, 10.699f, 21.0538f, 11.19f, 20.9552f, 11.7502f)
                horizontalLineTo(3.0454f)
                curveTo(2.9467f, 11.1899f, 2.8796f, 10.699f, 2.8545f, 10.2643f)
                curveTo(2.9016f, 10.255f, 2.9504f, 10.2502f, 3.0002f, 10.2502f)
                horizontalLineTo(2.8535f)
                curveTo(2.8017f, 9.3227f, 2.9426f, 8.6527f, 3.378f, 8.1141f)
                curveTo(3.9259f, 7.4364f, 4.775f, 7.171f, 6.1282f, 7.0671f)
                lineTo(8.3293f, 2.6648f)
                close()
            }
        }
            .build()
        return _cart4!!
    }

private var _cart4: ImageVector? = null
