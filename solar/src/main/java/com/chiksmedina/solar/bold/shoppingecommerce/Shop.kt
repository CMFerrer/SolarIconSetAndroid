package com.chiksmedina.solar.bold.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ShoppingEcommerceGroup

public val ShoppingEcommerceGroup.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(name = "Shop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7779f, 3.6548f)
                curveTo(3.5969f, 4.0157f, 3.5078f, 4.4609f, 3.3298f, 5.3513f)
                lineTo(2.7318f, 8.3409f)
                curveTo(2.3532f, 10.2339f, 3.8011f, 12.0f, 5.7316f, 12.0f)
                curveTo(7.3032f, 12.0f, 8.6191f, 10.8091f, 8.7755f, 9.2453f)
                lineTo(8.8445f, 8.5552f)
                curveTo(8.6814f, 10.4038f, 10.1385f, 12.0f, 11.9998f, 12.0f)
                curveTo(13.8737f, 12.0f, 15.338f, 10.382f, 15.1515f, 8.5174f)
                lineTo(15.2245f, 9.2453f)
                curveTo(15.3809f, 10.8091f, 16.6968f, 12.0f, 18.2685f, 12.0f)
                curveTo(20.1989f, 12.0f, 21.6468f, 10.2339f, 21.2682f, 8.3409f)
                lineTo(20.6703f, 5.3513f)
                curveTo(20.4922f, 4.4609f, 20.4031f, 4.0157f, 20.2221f, 3.6548f)
                curveTo(19.8406f, 2.8944f, 19.1542f, 2.3317f, 18.3337f, 2.1068f)
                curveTo(17.9443f, 2.0f, 17.4903f, 2.0f, 16.5823f, 2.0f)
                horizontalLineTo(14.4998f)
                horizontalLineTo(7.4177f)
                curveTo(6.5097f, 2.0f, 6.0557f, 2.0f, 5.6663f, 2.1068f)
                curveTo(4.8458f, 2.3317f, 4.1594f, 2.8944f, 3.7779f, 3.6548f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2685f, 13.4997f)
                curveTo(19.0856f, 13.4997f, 19.8448f, 13.2874f, 20.5f, 12.9187f)
                verticalLineTo(13.9997f)
                curveTo(20.5f, 17.771f, 20.5f, 19.6566f, 19.3284f, 20.8282f)
                curveTo(18.3853f, 21.7712f, 16.9796f, 21.9552f, 14.5f, 21.991f)
                verticalLineTo(18.4998f)
                curveTo(14.5f, 17.5651f, 14.5f, 17.0978f, 14.299f, 16.7498f)
                curveTo(14.1674f, 16.5217f, 13.978f, 16.3324f, 13.75f, 16.2007f)
                curveTo(13.4019f, 15.9998f, 12.9346f, 15.9998f, 12.0f, 15.9998f)
                curveTo(11.0654f, 15.9998f, 10.5981f, 15.9998f, 10.25f, 16.2007f)
                curveTo(10.022f, 16.3324f, 9.8326f, 16.5217f, 9.701f, 16.7498f)
                curveTo(9.5f, 17.0978f, 9.5f, 17.5651f, 9.5f, 18.4998f)
                verticalLineTo(21.991f)
                curveTo(7.0204f, 21.9552f, 5.6147f, 21.7712f, 4.6716f, 20.8282f)
                curveTo(3.5f, 19.6566f, 3.5f, 17.771f, 3.5f, 13.9997f)
                verticalLineTo(12.9186f)
                curveTo(4.1552f, 13.2874f, 4.9144f, 13.4997f, 5.7316f, 13.4997f)
                curveTo(6.9286f, 13.4997f, 8.0262f, 13.0361f, 8.8443f, 12.2717f)
                curveTo(9.6717f, 13.0318f, 10.7765f, 13.4997f, 11.9998f, 13.4997f)
                curveTo(13.2232f, 13.4997f, 14.3281f, 13.0317f, 15.1555f, 12.2715f)
                curveTo(15.9737f, 13.036f, 17.0713f, 13.4997f, 18.2685f, 13.4997f)
                close()
            }
        }
        .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
