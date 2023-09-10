package com.chiksmedina.solar.boldduotone.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Planet3: ImageVector
    get() {
        if (_planet3 != null) {
            return _planet3!!
        }
        _planet3 = Builder(
            name = "Planet3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.206f, 15.9119f)
                curveTo(20.9924f, 15.9989f, 20.7568f, 16.1f, 20.4949f, 16.2127f)
                lineTo(20.4847f, 16.217f)
                curveTo(19.9985f, 16.4262f, 19.4403f, 16.6663f, 18.8316f, 16.8912f)
                curveTo(17.6048f, 17.3446f, 16.1385f, 17.7502f, 14.5093f, 17.7502f)
                curveTo(12.6961f, 17.7502f, 11.3066f, 17.2655f, 10.192f, 16.731f)
                curveTo(9.7618f, 16.5247f, 9.3637f, 16.3062f, 9.0128f, 16.1136f)
                curveTo(8.9186f, 16.0619f, 8.8275f, 16.0119f, 8.7404f, 15.9647f)
                curveTo(8.311f, 15.7319f, 7.9762f, 15.5652f, 7.6781f, 15.4714f)
                curveTo(6.3404f, 15.0505f, 5.0489f, 14.8691f, 4.0877f, 14.7938f)
                curveTo(3.6086f, 14.7563f, 3.2153f, 14.7454f, 2.9443f, 14.7439f)
                curveTo(2.8088f, 14.7431f, 2.7041f, 14.7446f, 2.6348f, 14.7463f)
                curveTo(2.6001f, 14.7471f, 2.5743f, 14.748f, 2.5579f, 14.7486f)
                lineTo(2.5405f, 14.7493f)
                lineTo(2.5377f, 14.7494f)
                lineTo(2.385f, 14.7571f)
                curveTo(3.582f, 18.9391f, 7.4336f, 22.0f, 12.0001f, 22.0f)
                curveTo(16.1348f, 22.0f, 19.6834f, 19.4907f, 21.206f, 15.9119f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.237f, 7.1787f)
                lineTo(3.5342f, 7.4814f)
                lineTo(3.5373f, 7.4846f)
                lineTo(3.5561f, 7.5029f)
                curveTo(3.574f, 7.5204f, 3.6029f, 7.5479f, 3.6423f, 7.584f)
                curveTo(3.7211f, 7.6564f, 3.8418f, 7.7632f, 4.0018f, 7.8931f)
                curveTo(4.3223f, 8.1531f, 4.7975f, 8.5034f, 5.4058f, 8.8544f)
                curveTo(6.6251f, 9.5577f, 8.3552f, 10.2501f, 10.4372f, 10.2501f)
                curveTo(11.8108f, 10.2501f, 12.8623f, 9.8561f, 13.7544f, 9.39f)
                curveTo(14.1095f, 9.2044f, 14.4293f, 9.0133f, 14.7469f, 8.8235f)
                curveTo(14.8385f, 8.7687f, 14.93f, 8.714f, 15.0221f, 8.6596f)
                curveTo(15.4143f, 8.4279f, 15.8328f, 8.1918f, 16.2568f, 8.0464f)
                curveTo(17.6129f, 7.5816f, 18.797f, 7.3842f, 19.6475f, 7.3032f)
                curveTo(20.0731f, 7.2627f, 20.4162f, 7.2513f, 20.6568f, 7.2502f)
                curveTo(20.7106f, 7.25f, 20.7593f, 7.2503f, 20.8026f, 7.2509f)
                curveTo(19.1121f, 4.1241f, 15.8042f, 2.0f, 12.0001f, 2.0f)
                curveTo(8.2254f, 2.0f, 4.9392f, 4.0914f, 3.237f, 7.1787f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.7753f, 14.1179f)
                curveTo(21.9225f, 13.4352f, 22.0f, 12.7267f, 22.0f, 12.0001f)
                curveTo(22.0f, 10.8787f, 21.8154f, 9.8004f, 21.475f, 8.7939f)
                lineTo(20.9481f, 8.7562f)
                lineTo(20.947f, 8.7561f)
                lineTo(20.9374f, 8.7556f)
                curveTo(20.9272f, 8.755f, 20.91f, 8.7542f, 20.886f, 8.7533f)
                curveTo(20.838f, 8.7516f, 20.7629f, 8.7499f, 20.6632f, 8.7503f)
                curveTo(20.4637f, 8.7512f, 20.1661f, 8.7607f, 19.7895f, 8.7966f)
                curveTo(19.0358f, 8.8683f, 17.9699f, 9.0449f, 16.7431f, 9.4655f)
                curveTo(16.4799f, 9.5557f, 16.1798f, 9.7179f, 15.785f, 9.9512f)
                curveTo(15.7058f, 9.9979f, 15.623f, 10.0474f, 15.537f, 10.0989f)
                curveTo(15.2148f, 10.2916f, 14.8462f, 10.512f, 14.449f, 10.7195f)
                curveTo(13.419f, 11.2577f, 12.1263f, 11.7502f, 10.437f, 11.7502f)
                curveTo(8.019f, 11.7502f, 6.0305f, 10.9465f, 4.6562f, 10.1537f)
                curveTo(3.9678f, 9.7566f, 3.4274f, 9.3588f, 3.0565f, 9.0579f)
                curveTo(2.8709f, 8.9072f, 2.727f, 8.7802f, 2.6276f, 8.689f)
                curveTo(2.6095f, 8.6723f, 2.5928f, 8.6568f, 2.5776f, 8.6426f)
                curveTo(2.2036f, 9.692f, 2.0f, 10.8223f, 2.0f, 12.0001f)
                curveTo(2.0f, 12.4305f, 2.0272f, 12.8545f, 2.0799f, 13.2706f)
                lineTo(2.4641f, 13.2513f)
                lineTo(2.4667f, 13.2512f)
                lineTo(2.4746f, 13.2508f)
                lineTo(2.5017f, 13.2497f)
                curveTo(2.5247f, 13.2489f, 2.5572f, 13.2478f, 2.5988f, 13.2468f)
                curveTo(2.6821f, 13.2448f, 2.8016f, 13.2431f, 2.9528f, 13.244f)
                curveTo(3.2551f, 13.2457f, 3.6848f, 13.2578f, 4.2047f, 13.2985f)
                curveTo(5.2416f, 13.3796f, 6.6516f, 13.576f, 8.1282f, 14.0406f)
                curveTo(8.5788f, 14.1824f, 9.027f, 14.414f, 9.4552f, 14.6461f)
                curveTo(9.5548f, 14.7001f, 9.654f, 14.7545f, 9.7535f, 14.8091f)
                curveTo(10.0999f, 14.9991f, 10.4512f, 15.1918f, 10.8405f, 15.3786f)
                curveTo(11.8204f, 15.8484f, 12.9851f, 16.2503f, 14.5092f, 16.2503f)
                curveTo(15.8918f, 16.2503f, 17.1709f, 15.9059f, 18.3115f, 15.4843f)
                curveTo(18.8824f, 15.2734f, 19.4099f, 15.0465f, 19.9021f, 14.8348f)
                lineTo(19.9204f, 14.8269f)
                curveTo(20.3949f, 14.6228f, 20.8566f, 14.4242f, 21.2628f, 14.2888f)
                lineTo(21.7753f, 14.1179f)
                close()
            }
        }
            .build()
        return _planet3!!
    }

private var _planet3: ImageVector? = null
