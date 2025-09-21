package dev.chiksmedina.solar.boldduotone.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Cart: ImageVector
    get() {
        if (_cart != null) {
            return _cart!!
        }
        _cart = Builder(
            name = "Cart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0234f, 2.0f)
                curveTo(9.0569f, 2.0f, 8.2734f, 2.7835f, 8.2734f, 3.75f)
                curveTo(8.2734f, 4.7165f, 9.0569f, 5.5f, 10.0234f, 5.5f)
                horizontalLineTo(14.0234f)
                curveTo(14.9899f, 5.5f, 15.7734f, 4.7165f, 15.7734f, 3.75f)
                curveTo(15.7734f, 2.7835f, 14.9899f, 2.0f, 14.0234f, 2.0f)
                horizontalLineTo(10.0234f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.8867f, 16.2052f)
                curveTo(3.0288f, 12.7734f, 2.5998f, 11.0575f, 3.5006f, 9.9038f)
                curveTo(4.4015f, 8.75f, 6.1702f, 8.75f, 9.7076f, 8.75f)
                horizontalLineTo(14.3382f)
                curveTo(17.8757f, 8.75f, 19.6444f, 8.75f, 20.5452f, 9.9038f)
                curveTo(21.446f, 11.0575f, 21.0171f, 12.7734f, 20.1591f, 16.2052f)
                curveTo(19.6134f, 18.3879f, 19.3406f, 19.4792f, 18.5268f, 20.1146f)
                curveTo(17.713f, 20.75f, 16.5881f, 20.75f, 14.3382f, 20.75f)
                horizontalLineTo(9.7076f)
                curveTo(7.4577f, 20.75f, 6.3328f, 20.75f, 5.519f, 20.1146f)
                curveTo(4.7052f, 19.4792f, 4.4324f, 18.3879f, 3.8867f, 16.2052f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.6039f, 4.5024f)
                curveTo(15.7126f, 4.2745f, 15.7734f, 4.0194f, 15.7734f, 3.7501f)
                curveTo(15.7734f, 3.482f, 15.7132f, 3.2281f, 15.6055f, 3.001f)
                curveTo(16.289f, 3.0059f, 16.8217f, 3.0373f, 17.2973f, 3.2232f)
                curveTo(17.8655f, 3.4453f, 18.3597f, 3.8228f, 18.7234f, 4.3125f)
                curveTo(19.0903f, 4.8066f, 19.2626f, 5.4399f, 19.4996f, 6.3115f)
                lineTo(19.546f, 6.4819f)
                lineTo(20.0587f, 9.4449f)
                curveTo(19.6501f, 9.1629f, 19.1231f, 8.9954f, 18.4414f, 8.8959f)
                lineTo(18.0801f, 6.8079f)
                curveTo(17.7964f, 5.7681f, 17.6934f, 5.4414f, 17.5191f, 5.2068f)
                curveTo(17.3233f, 4.9431f, 17.0572f, 4.7399f, 16.7512f, 4.6203f)
                curveTo(16.5314f, 4.5344f, 16.2658f, 4.5091f, 15.6039f, 4.5024f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.4414f, 3.001f)
                curveTo(8.3337f, 3.2281f, 8.2734f, 3.482f, 8.2734f, 3.7501f)
                curveTo(8.2734f, 4.0194f, 8.3343f, 4.2745f, 8.4429f, 4.5024f)
                curveTo(7.7811f, 4.5091f, 7.5155f, 4.5344f, 7.2957f, 4.6203f)
                curveTo(6.9898f, 4.7399f, 6.7236f, 4.9431f, 6.5278f, 5.2068f)
                curveTo(6.3536f, 5.4414f, 6.2506f, 5.7681f, 5.9668f, 6.8079f)
                lineTo(5.6055f, 8.8958f)
                curveTo(4.924f, 8.9953f, 4.397f, 9.1627f, 3.9883f, 9.4444f)
                lineTo(4.5009f, 6.4819f)
                lineTo(4.5473f, 6.3115f)
                curveTo(4.7844f, 5.4399f, 4.9566f, 4.8066f, 5.3236f, 4.3125f)
                curveTo(5.6873f, 3.8228f, 6.1815f, 3.4453f, 6.7497f, 3.2232f)
                curveTo(7.2252f, 3.0373f, 7.7579f, 3.0059f, 8.4414f, 3.001f)
                close()
            }
        }
            .build()
        return _cart!!
    }

private var _cart: ImageVector? = null
