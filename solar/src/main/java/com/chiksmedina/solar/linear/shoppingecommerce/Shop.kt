package com.chiksmedina.solar.linear.shoppingecommerce

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
import com.chiksmedina.solar.linear.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Shop: ImageVector
    get() {
        if (_shop != null) {
            return _shop!!
        }
        _shop = Builder(
            name = "Shop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.5f, 11.0f)
                verticalLineTo(14.0f)
                curveTo(3.5f, 17.7712f, 3.5f, 19.6569f, 4.6716f, 20.8284f)
                curveTo(5.8432f, 22.0f, 7.7288f, 22.0f, 11.5f, 22.0f)
                horizontalLineTo(12.5f)
                curveTo(16.2712f, 22.0f, 18.1569f, 22.0f, 19.3284f, 20.8284f)
                curveTo(20.5f, 19.6569f, 20.5f, 17.7712f, 20.5f, 14.0f)
                verticalLineTo(11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 2.0f)
                horizontalLineTo(14.5f)
                lineTo(15.1517f, 8.5174f)
                curveTo(15.3382f, 10.382f, 13.8739f, 12.0f, 12.0f, 12.0f)
                curveTo(10.1261f, 12.0f, 8.6618f, 10.382f, 8.8483f, 8.5174f)
                lineTo(9.5f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.3297f, 5.3513f)
                curveTo(3.5078f, 4.4609f, 3.5968f, 4.0157f, 3.7779f, 3.6548f)
                curveTo(4.1593f, 2.8944f, 4.8458f, 2.3317f, 5.6663f, 2.1068f)
                curveTo(6.0556f, 2.0f, 6.5097f, 2.0f, 7.4177f, 2.0f)
                horizontalLineTo(9.5f)
                lineTo(8.7755f, 9.2453f)
                curveTo(8.6191f, 10.8091f, 7.3032f, 12.0f, 5.7315f, 12.0f)
                curveTo(3.8011f, 12.0f, 2.3532f, 10.2339f, 2.7318f, 8.3409f)
                lineTo(3.3297f, 5.3513f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.6703f, 5.3513f)
                curveTo(20.4922f, 4.4609f, 20.4031f, 4.0157f, 20.2221f, 3.6548f)
                curveTo(19.8406f, 2.8944f, 19.1542f, 2.3317f, 18.3337f, 2.1068f)
                curveTo(17.9443f, 2.0f, 17.4903f, 2.0f, 16.5823f, 2.0f)
                horizontalLineTo(14.5f)
                lineTo(15.2245f, 9.2453f)
                curveTo(15.3809f, 10.8091f, 16.6968f, 12.0f, 18.2685f, 12.0f)
                curveTo(20.1989f, 12.0f, 21.6468f, 10.2339f, 21.2682f, 8.3409f)
                lineTo(20.6703f, 5.3513f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 21.5f)
                verticalLineTo(18.5f)
                curveTo(9.5f, 17.5654f, 9.5f, 17.0981f, 9.701f, 16.75f)
                curveTo(9.8326f, 16.522f, 10.022f, 16.3326f, 10.25f, 16.201f)
                curveTo(10.5981f, 16.0f, 11.0654f, 16.0f, 12.0f, 16.0f)
                curveTo(12.9346f, 16.0f, 13.4019f, 16.0f, 13.75f, 16.201f)
                curveTo(13.978f, 16.3326f, 14.1674f, 16.522f, 14.299f, 16.75f)
                curveTo(14.5f, 17.0981f, 14.5f, 17.5654f, 14.5f, 18.5f)
                verticalLineTo(21.5f)
            }
        }
            .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
