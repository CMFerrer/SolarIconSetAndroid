package dev.chiksmedina.solar.outline.shoppingecommerce

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
import dev.chiksmedina.solar.outline.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Cart5: ImageVector
    get() {
        if (_cart5 != null) {
            return _cart5!!
        }
        _cart5 = Builder(
            name = "Cart5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.25f, 12.0002f)
                curveTo(7.25f, 11.586f, 7.5858f, 11.2502f, 8.0f, 11.2502f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 11.2502f, 16.75f, 11.586f, 16.75f, 12.0002f)
                curveTo(16.75f, 12.4144f, 16.4142f, 12.7502f, 16.0f, 12.7502f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 12.7502f, 7.25f, 12.4144f, 7.25f, 12.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 14.2502f)
                curveTo(9.5858f, 14.2502f, 9.25f, 14.586f, 9.25f, 15.0002f)
                curveTo(9.25f, 15.4144f, 9.5858f, 15.7502f, 10.0f, 15.7502f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 15.7502f, 14.75f, 15.4144f, 14.75f, 15.0002f)
                curveTo(14.75f, 14.586f, 14.4142f, 14.2502f, 14.0f, 14.2502f)
                horizontalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.6646f, 2.3293f)
                curveTo(15.0351f, 2.1441f, 15.4856f, 2.2943f, 15.6708f, 2.6648f)
                lineTo(17.4841f, 6.2913f)
                curveTo(17.9116f, 6.3131f, 18.3015f, 6.3463f, 18.6548f, 6.397f)
                curveTo(19.7105f, 6.5486f, 20.5843f, 6.8745f, 21.2053f, 7.6426f)
                curveTo(21.8263f, 8.4108f, 21.9618f, 9.3334f, 21.8889f, 10.3975f)
                curveTo(21.8181f, 11.4287f, 21.5395f, 12.729f, 21.1911f, 14.3547f)
                lineTo(20.7396f, 16.4614f)
                curveTo(20.5047f, 17.5578f, 20.3141f, 18.4472f, 20.0743f, 19.142f)
                curveTo(19.8244f, 19.8661f, 19.495f, 20.4616f, 18.9323f, 20.9164f)
                curveTo(18.3697f, 21.3713f, 17.7184f, 21.5686f, 16.958f, 21.6613f)
                curveTo(16.2284f, 21.7502f, 15.3188f, 21.7502f, 14.1975f, 21.7502f)
                horizontalLineTo(9.8026f)
                curveTo(8.6812f, 21.7502f, 7.7716f, 21.7502f, 7.042f, 21.6613f)
                curveTo(6.2816f, 21.5686f, 5.6304f, 21.3713f, 5.0677f, 20.9164f)
                curveTo(4.5051f, 20.4616f, 4.1757f, 19.8661f, 3.9257f, 19.142f)
                curveTo(3.6859f, 18.4472f, 3.4953f, 17.5578f, 3.2604f, 16.4614f)
                lineTo(2.809f, 14.3547f)
                curveTo(2.4606f, 12.7291f, 2.1819f, 11.4287f, 2.1112f, 10.3975f)
                curveTo(2.0382f, 9.3334f, 2.1738f, 8.4108f, 2.7947f, 7.6426f)
                curveTo(3.4157f, 6.8745f, 4.2895f, 6.5486f, 5.3452f, 6.397f)
                curveTo(5.6985f, 6.3463f, 6.0884f, 6.3131f, 6.5159f, 6.2913f)
                lineTo(8.3292f, 2.6648f)
                curveTo(8.5144f, 2.2943f, 8.9649f, 2.1441f, 9.3354f, 2.3293f)
                curveTo(9.7059f, 2.5146f, 9.8561f, 2.9651f, 9.6708f, 3.3356f)
                lineTo(8.2125f, 6.2522f)
                curveTo(8.576f, 6.2502f, 8.9587f, 6.2502f, 9.3608f, 6.2502f)
                horizontalLineTo(14.6392f)
                curveTo(15.0413f, 6.2502f, 15.424f, 6.2502f, 15.7875f, 6.2522f)
                lineTo(14.3292f, 3.3356f)
                curveTo(14.1439f, 2.9651f, 14.2941f, 2.5146f, 14.6646f, 2.3293f)
                close()
                moveTo(5.7321f, 7.8589f)
                lineTo(5.3292f, 8.6648f)
                curveTo(5.1439f, 9.0352f, 5.2941f, 9.4857f, 5.6646f, 9.671f)
                curveTo(6.0351f, 9.8562f, 6.4856f, 9.7061f, 6.6708f, 9.3356f)
                lineTo(7.4581f, 7.7611f)
                curveTo(8.0285f, 7.7505f, 8.6779f, 7.7502f, 9.422f, 7.7502f)
                horizontalLineTo(14.5781f)
                curveTo(15.3221f, 7.7502f, 15.9715f, 7.7505f, 16.5419f, 7.7611f)
                lineTo(17.3292f, 9.3356f)
                curveTo(17.5144f, 9.7061f, 17.9649f, 9.8562f, 18.3354f, 9.671f)
                curveTo(18.7059f, 9.4857f, 18.8561f, 9.0352f, 18.6708f, 8.6648f)
                lineTo(18.2679f, 7.8589f)
                curveTo(18.3271f, 7.866f, 18.385f, 7.8737f, 18.4416f, 7.8818f)
                curveTo(19.3255f, 8.0087f, 19.7592f, 8.2398f, 20.0388f, 8.5856f)
                curveTo(20.3184f, 8.9315f, 20.4535f, 9.404f, 20.3924f, 10.2948f)
                curveTo(20.3299f, 11.206f, 20.0757f, 12.401f, 19.7116f, 14.1002f)
                lineTo(19.283f, 16.1002f)
                curveTo(19.0356f, 17.2547f, 18.8629f, 18.0543f, 18.6564f, 18.6526f)
                curveTo(18.4566f, 19.2316f, 18.2517f, 19.5378f, 17.9893f, 19.7499f)
                curveTo(17.7269f, 19.9621f, 17.3846f, 20.0982f, 16.7766f, 20.1723f)
                curveTo(16.1483f, 20.2489f, 15.3303f, 20.2502f, 14.1495f, 20.2502f)
                horizontalLineTo(9.8505f)
                curveTo(8.6698f, 20.2502f, 7.8518f, 20.2489f, 7.2235f, 20.1723f)
                curveTo(6.6155f, 20.0982f, 6.2732f, 19.9621f, 6.0107f, 19.7499f)
                curveTo(5.7483f, 19.5378f, 5.5435f, 19.2316f, 5.3436f, 18.6526f)
                curveTo(5.1371f, 18.0543f, 4.9645f, 17.2547f, 4.7171f, 16.1002f)
                lineTo(4.2885f, 14.1002f)
                curveTo(3.9244f, 12.401f, 3.6702f, 11.206f, 3.6077f, 10.2948f)
                curveTo(3.5466f, 9.404f, 3.6817f, 8.9315f, 3.9612f, 8.5856f)
                curveTo(4.2408f, 8.2398f, 4.6745f, 8.0087f, 5.5584f, 7.8818f)
                curveTo(5.615f, 7.8737f, 5.6729f, 7.866f, 5.7321f, 7.8589f)
                close()
            }
        }
            .build()
        return _cart5!!
    }

private var _cart5: ImageVector? = null
