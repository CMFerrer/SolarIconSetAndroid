package dev.chiksmedina.solar.outline.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ShoppingEcommerceGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.3071f, 1.25f)
                curveTo(6.5061f, 1.2498f, 5.9565f, 1.2496f, 5.468f, 1.3835f)
                curveTo(4.4424f, 1.6646f, 3.5844f, 2.368f, 3.1075f, 3.3186f)
                curveTo(2.8804f, 3.7713f, 2.7728f, 4.3103f, 2.616f, 5.0958f)
                lineTo(1.9964f, 8.1939f)
                curveTo(1.7648f, 9.3519f, 2.0821f, 10.4718f, 2.75f, 11.3115f)
                lineTo(2.75f, 14.0565f)
                curveTo(2.75f, 15.8942f, 2.75f, 17.3499f, 2.9032f, 18.4891f)
                curveTo(3.0608f, 19.6615f, 3.3929f, 20.6104f, 4.1413f, 21.3588f)
                curveTo(4.8896f, 22.1072f, 5.8386f, 22.4393f, 7.011f, 22.5969f)
                curveTo(8.1502f, 22.7501f, 9.6058f, 22.7501f, 11.4436f, 22.75f)
                horizontalLineTo(12.5564f)
                curveTo(14.3942f, 22.7501f, 15.8498f, 22.7501f, 16.989f, 22.5969f)
                curveTo(18.1615f, 22.4393f, 19.1104f, 22.1072f, 19.8588f, 21.3588f)
                curveTo(20.6071f, 20.6104f, 20.9392f, 19.6615f, 21.0969f, 18.4891f)
                curveTo(21.25f, 17.3499f, 21.25f, 15.8942f, 21.25f, 14.0565f)
                verticalLineTo(11.3116f)
                curveTo(21.9179f, 10.4718f, 22.2352f, 9.3519f, 22.0036f, 8.1939f)
                lineTo(21.384f, 5.0958f)
                curveTo(21.2272f, 4.3103f, 21.1196f, 3.7713f, 20.8925f, 3.3186f)
                curveTo(20.4157f, 2.368f, 19.5577f, 1.6646f, 18.532f, 1.3835f)
                curveTo(18.0436f, 1.2496f, 17.4939f, 1.2498f, 16.693f, 1.25f)
                horizontalLineTo(7.3071f)
                close()
                moveTo(18.2685f, 12.75f)
                curveTo(18.7974f, 12.75f, 19.2971f, 12.6436f, 19.75f, 12.4524f)
                verticalLineTo(14.0f)
                curveTo(19.75f, 15.9069f, 19.7484f, 17.2615f, 19.6103f, 18.2892f)
                curveTo(19.475f, 19.2953f, 19.2213f, 19.8749f, 18.7981f, 20.2981f)
                curveTo(18.3749f, 20.7214f, 17.7953f, 20.975f, 16.7892f, 21.1103f)
                curveTo(16.3437f, 21.1702f, 15.8367f, 21.2044f, 15.25f, 21.224f)
                verticalLineTo(18.4678f)
                curveTo(15.25f, 18.028f, 15.25f, 17.6487f, 15.2218f, 17.3374f)
                curveTo(15.192f, 17.0082f, 15.1259f, 16.6823f, 14.9486f, 16.375f)
                curveTo(14.7511f, 16.033f, 14.4671f, 15.749f, 14.125f, 15.5515f)
                curveTo(13.8178f, 15.3741f, 13.4918f, 15.3081f, 13.1627f, 15.2782f)
                curveTo(12.8514f, 15.25f, 12.472f, 15.25f, 12.0322f, 15.25f)
                horizontalLineTo(11.9678f)
                curveTo(11.528f, 15.25f, 11.1487f, 15.25f, 10.8374f, 15.2782f)
                curveTo(10.5082f, 15.3081f, 10.1822f, 15.3741f, 9.875f, 15.5515f)
                curveTo(9.533f, 15.749f, 9.2489f, 16.033f, 9.0514f, 16.375f)
                curveTo(8.8741f, 16.6823f, 8.808f, 17.0082f, 8.7782f, 17.3374f)
                curveTo(8.75f, 17.6487f, 8.75f, 18.028f, 8.75f, 18.4678f)
                lineTo(8.75f, 21.224f)
                curveTo(8.1633f, 21.2044f, 7.6564f, 21.1702f, 7.2109f, 21.1103f)
                curveTo(6.2048f, 20.975f, 5.6251f, 20.7214f, 5.2019f, 20.2981f)
                curveTo(4.7787f, 19.8749f, 4.525f, 19.2953f, 4.3898f, 18.2892f)
                curveTo(4.2516f, 17.2615f, 4.25f, 15.9069f, 4.25f, 14.0f)
                verticalLineTo(12.4524f)
                curveTo(4.7029f, 12.6436f, 5.2027f, 12.75f, 5.7316f, 12.75f)
                curveTo(7.0055f, 12.75f, 8.1445f, 12.1217f, 8.8381f, 11.1459f)
                curveTo(9.5476f, 12.114f, 10.6932f, 12.75f, 11.9998f, 12.75f)
                curveTo(13.3066f, 12.75f, 14.4523f, 12.1139f, 15.1618f, 11.1456f)
                curveTo(15.8553f, 12.1215f, 16.9944f, 12.75f, 18.2685f, 12.75f)
                close()
                moveTo(10.25f, 21.2481f)
                curveTo(10.6384f, 21.25f, 11.0541f, 21.25f, 11.5f, 21.25f)
                horizontalLineTo(12.5f)
                curveTo(12.9459f, 21.25f, 13.3616f, 21.25f, 13.75f, 21.2481f)
                verticalLineTo(18.5f)
                curveTo(13.75f, 18.0189f, 13.7493f, 17.7083f, 13.728f, 17.4728f)
                curveTo(13.7075f, 17.2477f, 13.6731f, 17.1659f, 13.6495f, 17.125f)
                curveTo(13.5837f, 17.011f, 13.489f, 16.9164f, 13.375f, 16.8505f)
                curveTo(13.3341f, 16.8269f, 13.2524f, 16.7925f, 13.0273f, 16.7721f)
                curveTo(12.7918f, 16.7508f, 12.4811f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5189f, 16.75f, 11.2082f, 16.7508f, 10.9728f, 16.7721f)
                curveTo(10.7476f, 16.7925f, 10.6659f, 16.8269f, 10.625f, 16.8505f)
                curveTo(10.511f, 16.9164f, 10.4163f, 17.011f, 10.3505f, 17.125f)
                curveTo(10.3269f, 17.1659f, 10.2925f, 17.2476f, 10.2721f, 17.4728f)
                curveTo(10.2507f, 17.7083f, 10.25f, 18.0189f, 10.25f, 18.5f)
                verticalLineTo(21.2481f)
                close()
                moveTo(8.6711f, 2.7501f)
                horizontalLineTo(7.4177f)
                curveTo(6.4633f, 2.7501f, 6.1327f, 2.7566f, 5.8646f, 2.8301f)
                curveTo(5.2492f, 2.9988f, 4.7344f, 3.4208f, 4.4483f, 3.9912f)
                curveTo(4.3236f, 4.2397f, 4.2524f, 4.5625f, 4.0652f, 5.4985f)
                lineTo(3.4673f, 8.4881f)
                curveTo(3.1815f, 9.9169f, 4.2744f, 11.25f, 5.7316f, 11.25f)
                curveTo(6.9179f, 11.25f, 7.9112f, 10.3511f, 8.0292f, 9.1707f)
                lineTo(8.0978f, 8.4848f)
                lineTo(8.1018f, 8.4428f)
                lineTo(8.6711f, 2.7501f)
                close()
                moveTo(9.5913f, 8.625f)
                lineTo(10.1788f, 2.7501f)
                horizontalLineTo(13.8211f)
                lineTo(14.4053f, 8.592f)
                curveTo(14.5476f, 10.0152f, 13.43f, 11.25f, 11.9998f, 11.25f)
                curveTo(10.5807f, 11.25f, 9.4693f, 10.0342f, 9.5913f, 8.625f)
                close()
                moveTo(18.1355f, 2.8301f)
                curveTo(17.8673f, 2.7566f, 17.5368f, 2.7501f, 16.5823f, 2.7501f)
                horizontalLineTo(15.3288f)
                lineTo(15.9708f, 9.1707f)
                curveTo(16.0889f, 10.3511f, 17.0822f, 11.25f, 18.2685f, 11.25f)
                curveTo(19.7256f, 11.25f, 20.8185f, 9.9169f, 20.5328f, 8.4881f)
                lineTo(19.9348f, 5.4985f)
                curveTo(19.7477f, 4.5625f, 19.6764f, 4.2397f, 19.5517f, 3.9912f)
                curveTo(19.2656f, 3.4208f, 18.7508f, 2.9988f, 18.1355f, 2.8301f)
                close()
            }
        }
            .build()
        return _shop!!
    }

private var _shop: ImageVector? = null
