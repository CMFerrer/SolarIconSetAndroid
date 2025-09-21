package dev.chiksmedina.solar.bold.shoppingecommerce

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
import dev.chiksmedina.solar.bold.ShoppingEcommerceGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.6646f, 2.3293f)
                curveTo(15.0351f, 2.1441f, 15.4856f, 2.2943f, 15.6708f, 2.6648f)
                lineTo(17.872f, 7.0671f)
                curveTo(19.2251f, 7.171f, 20.0742f, 7.4364f, 20.6221f, 8.1141f)
                curveTo(21.0575f, 8.6527f, 21.1984f, 9.3228f, 21.1466f, 10.2502f)
                horizontalLineTo(2.8535f)
                curveTo(2.8017f, 9.3228f, 2.9426f, 8.6527f, 3.378f, 8.1141f)
                curveTo(3.9258f, 7.4364f, 4.7749f, 7.171f, 6.128f, 7.0671f)
                lineTo(8.3292f, 2.6648f)
                curveTo(8.5144f, 2.2943f, 8.9649f, 2.1441f, 9.3354f, 2.3293f)
                curveTo(9.7059f, 2.5146f, 9.8561f, 2.9651f, 9.6708f, 3.3356f)
                lineTo(7.8359f, 7.0054f)
                curveTo(8.3191f, 7.0002f, 8.8464f, 7.0002f, 9.422f, 7.0002f)
                horizontalLineTo(14.5781f)
                curveTo(15.1537f, 7.0002f, 15.6809f, 7.0002f, 16.1641f, 7.0054f)
                lineTo(14.3292f, 3.3356f)
                curveTo(14.1439f, 2.9651f, 14.2941f, 2.5146f, 14.6646f, 2.3293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.5551f, 14.2573f)
                curveTo(3.3481f, 13.2913f, 3.171f, 12.4645f, 3.0451f, 11.7502f)
                horizontalLineTo(20.9549f)
                curveTo(20.8291f, 12.4645f, 20.6519f, 13.2913f, 20.4449f, 14.2573f)
                lineTo(20.0164f, 16.2573f)
                curveTo(19.5294f, 18.5299f, 19.2859f, 19.6662f, 18.4608f, 20.3332f)
                curveTo(17.6357f, 21.0002f, 16.4737f, 21.0002f, 14.1495f, 21.0002f)
                horizontalLineTo(9.8505f)
                curveTo(7.5264f, 21.0002f, 6.3643f, 21.0002f, 5.5392f, 20.3332f)
                curveTo(4.7142f, 19.6662f, 4.4707f, 18.5299f, 3.9837f, 16.2573f)
                lineTo(3.5551f, 14.2573f)
                close()
                moveTo(10.0f, 13.2502f)
                curveTo(9.5858f, 13.2502f, 9.25f, 13.586f, 9.25f, 14.0002f)
                curveTo(9.25f, 14.4144f, 9.5858f, 14.7502f, 10.0f, 14.7502f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 14.7502f, 14.75f, 14.4144f, 14.75f, 14.0002f)
                curveTo(14.75f, 13.586f, 14.4142f, 13.2502f, 14.0f, 13.2502f)
                horizontalLineTo(10.0f)
                close()
            }
        }
            .build()
        return _cart4!!
    }

private var _cart4: ImageVector? = null
