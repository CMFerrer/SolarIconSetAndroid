package com.chiksmedina.solar.lineduotone.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ShoppingEcommerceGroup

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
                moveTo(9.5f, 2.0f)
                horizontalLineTo(14.5f)
                lineTo(15.1518f, 8.5174f)
                curveTo(15.3382f, 10.382f, 13.874f, 12.0f, 12.0f, 12.0f)
                curveTo(10.1261f, 12.0f, 8.6618f, 10.382f, 8.8483f, 8.5174f)
                lineTo(9.5f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.3298f, 5.3513f)
                curveTo(3.5078f, 4.4609f, 3.5969f, 4.0157f, 3.7779f, 3.6548f)
                curveTo(4.1594f, 2.8944f, 4.8458f, 2.3317f, 5.6663f, 2.1068f)
                curveTo(6.0557f, 2.0f, 6.5097f, 2.0f, 7.4177f, 2.0f)
                horizontalLineTo(9.5f)
                lineTo(8.7755f, 9.2453f)
                curveTo(8.6191f, 10.8091f, 7.3032f, 12.0f, 5.7316f, 12.0f)
                curveTo(3.8011f, 12.0f, 2.3532f, 10.2339f, 2.7318f, 8.3409f)
                lineTo(3.3298f, 5.3513f)
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.75f, 21.5f)
                curveTo(8.75f, 21.9142f, 9.0858f, 22.25f, 9.5f, 22.25f)
                curveTo(9.9142f, 22.25f, 10.25f, 21.9142f, 10.25f, 21.5f)
                horizontalLineTo(8.75f)
                close()
                moveTo(13.75f, 21.5f)
                curveTo(13.75f, 21.9142f, 14.0858f, 22.25f, 14.5f, 22.25f)
                curveTo(14.9142f, 22.25f, 15.25f, 21.9142f, 15.25f, 21.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(13.75f, 16.201f)
                lineTo(14.125f, 15.5514f)
                lineTo(14.125f, 15.5514f)
                lineTo(13.75f, 16.201f)
                close()
                moveTo(14.299f, 16.75f)
                lineTo(13.6495f, 17.125f)
                lineTo(13.6495f, 17.125f)
                lineTo(14.299f, 16.75f)
                close()
                moveTo(9.701f, 16.75f)
                lineTo(10.3505f, 17.125f)
                lineTo(10.3505f, 17.125f)
                lineTo(9.701f, 16.75f)
                close()
                moveTo(10.25f, 16.201f)
                lineTo(10.625f, 16.8505f)
                lineTo(10.625f, 16.8505f)
                lineTo(10.25f, 16.201f)
                close()
                moveTo(12.5f, 21.25f)
                horizontalLineTo(11.5f)
                verticalLineTo(22.75f)
                horizontalLineTo(12.5f)
                verticalLineTo(21.25f)
                close()
                moveTo(4.25f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.75f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(19.75f, 11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(11.5f, 21.25f)
                curveTo(9.5932f, 21.25f, 8.2385f, 21.2484f, 7.2108f, 21.1102f)
                curveTo(6.2048f, 20.975f, 5.6251f, 20.7213f, 5.2019f, 20.2981f)
                lineTo(4.1412f, 21.3588f)
                curveTo(4.8896f, 22.1071f, 5.8386f, 22.4392f, 7.011f, 22.5969f)
                curveTo(8.1618f, 22.7516f, 9.6356f, 22.75f, 11.5f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(2.75f, 14.0f)
                curveTo(2.75f, 15.8644f, 2.7484f, 17.3382f, 2.9031f, 18.489f)
                curveTo(3.0608f, 19.6614f, 3.3929f, 20.6104f, 4.1412f, 21.3588f)
                lineTo(5.2019f, 20.2981f)
                curveTo(4.7787f, 19.8749f, 4.525f, 19.2952f, 4.3898f, 18.2892f)
                curveTo(4.2516f, 17.2615f, 4.25f, 15.9068f, 4.25f, 14.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(12.5f, 22.75f)
                curveTo(14.3644f, 22.75f, 15.8382f, 22.7516f, 16.989f, 22.5969f)
                curveTo(18.1614f, 22.4392f, 19.1104f, 22.1071f, 19.8588f, 21.3588f)
                lineTo(18.7981f, 20.2981f)
                curveTo(18.3749f, 20.7213f, 17.7952f, 20.975f, 16.7892f, 21.1102f)
                curveTo(15.7615f, 21.2484f, 14.4068f, 21.25f, 12.5f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(19.75f, 14.0f)
                curveTo(19.75f, 15.9068f, 19.7484f, 17.2615f, 19.6102f, 18.2892f)
                curveTo(19.475f, 19.2952f, 19.2213f, 19.8749f, 18.7981f, 20.2981f)
                lineTo(19.8588f, 21.3588f)
                curveTo(20.6071f, 20.6104f, 20.9392f, 19.6614f, 21.0969f, 18.489f)
                curveTo(21.2516f, 17.3382f, 21.25f, 15.8644f, 21.25f, 14.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(10.25f, 21.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(21.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(13.75f, 18.5f)
                verticalLineTo(21.5f)
                horizontalLineTo(15.25f)
                verticalLineTo(18.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(12.0f, 16.75f)
                curveTo(12.4811f, 16.75f, 12.7918f, 16.7507f, 13.0273f, 16.7721f)
                curveTo(13.2524f, 16.7925f, 13.3341f, 16.8269f, 13.375f, 16.8505f)
                lineTo(14.125f, 15.5514f)
                curveTo(13.8178f, 15.3741f, 13.4918f, 15.308f, 13.1626f, 15.2782f)
                curveTo(12.8438f, 15.2493f, 12.4535f, 15.25f, 12.0f, 15.25f)
                verticalLineTo(16.75f)
                close()
                moveTo(15.25f, 18.5f)
                curveTo(15.25f, 18.0465f, 15.2507f, 17.6562f, 15.2218f, 17.3374f)
                curveTo(15.192f, 17.0082f, 15.1259f, 16.6822f, 14.9486f, 16.375f)
                lineTo(13.6495f, 17.125f)
                curveTo(13.6731f, 17.1659f, 13.7075f, 17.2476f, 13.7279f, 17.4727f)
                curveTo(13.7493f, 17.7082f, 13.75f, 18.0189f, 13.75f, 18.5f)
                horizontalLineTo(15.25f)
                close()
                moveTo(13.375f, 16.8505f)
                curveTo(13.489f, 16.9163f, 13.5837f, 17.011f, 13.6495f, 17.125f)
                lineTo(14.9486f, 16.375f)
                curveTo(14.7511f, 16.033f, 14.467f, 15.7489f, 14.125f, 15.5514f)
                lineTo(13.375f, 16.8505f)
                close()
                moveTo(10.25f, 18.5f)
                curveTo(10.25f, 18.0189f, 10.2507f, 17.7082f, 10.2721f, 17.4727f)
                curveTo(10.2925f, 17.2476f, 10.3269f, 17.1659f, 10.3505f, 17.125f)
                lineTo(9.0514f, 16.375f)
                curveTo(8.8741f, 16.6822f, 8.808f, 17.0082f, 8.7782f, 17.3374f)
                curveTo(8.7493f, 17.6562f, 8.75f, 18.0465f, 8.75f, 18.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(12.0f, 15.25f)
                curveTo(11.5465f, 15.25f, 11.1562f, 15.2493f, 10.8374f, 15.2782f)
                curveTo(10.5082f, 15.308f, 10.1822f, 15.3741f, 9.875f, 15.5514f)
                lineTo(10.625f, 16.8505f)
                curveTo(10.6659f, 16.8269f, 10.7476f, 16.7925f, 10.9727f, 16.7721f)
                curveTo(11.2082f, 16.7507f, 11.5189f, 16.75f, 12.0f, 16.75f)
                verticalLineTo(15.25f)
                close()
                moveTo(10.3505f, 17.125f)
                curveTo(10.4163f, 17.011f, 10.511f, 16.9163f, 10.625f, 16.8505f)
                lineTo(9.875f, 15.5514f)
                curveTo(9.533f, 15.7489f, 9.2489f, 16.033f, 9.0514f, 16.375f)
                lineTo(10.3505f, 17.125f)
                close()
            }
        }
            .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
