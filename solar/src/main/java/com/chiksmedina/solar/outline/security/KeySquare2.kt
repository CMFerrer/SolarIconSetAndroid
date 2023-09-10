package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.KeySquare2: ImageVector
    get() {
        if (_keySquare2 != null) {
            return _keySquare2!!
        }
        _keySquare2 = Builder(
            name = "KeySquare2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.7568f, 1.9829f)
                curveTo(9.7663f, 2.397f, 9.4383f, 2.7403f, 9.0242f, 2.7498f)
                curveTo(6.2025f, 2.8143f, 4.8735f, 3.0989f, 3.9963f, 3.9762f)
                curveTo(3.4259f, 4.5466f, 3.0986f, 5.3182f, 2.9265f, 6.598f)
                curveTo(2.7516f, 7.8994f, 2.75f, 9.6094f, 2.75f, 11.99f)
                curveTo(2.75f, 14.3705f, 2.7516f, 16.0805f, 2.9265f, 17.3819f)
                curveTo(3.0986f, 18.6617f, 3.4259f, 19.4333f, 3.9963f, 20.0037f)
                curveTo(4.5667f, 20.5741f, 5.3383f, 20.9014f, 6.6181f, 21.0735f)
                curveTo(7.9195f, 21.2484f, 9.6295f, 21.25f, 12.0101f, 21.25f)
                curveTo(14.3906f, 21.25f, 16.1006f, 21.2484f, 17.402f, 21.0735f)
                curveTo(18.6818f, 20.9014f, 19.4534f, 20.5741f, 20.0238f, 20.0037f)
                curveTo(20.9011f, 19.1265f, 21.1857f, 17.7975f, 21.2502f, 14.9758f)
                curveTo(21.2597f, 14.5617f, 21.603f, 14.2337f, 22.0171f, 14.2432f)
                curveTo(22.4312f, 14.2526f, 22.7593f, 14.596f, 22.7498f, 15.0101f)
                curveTo(22.6866f, 17.7765f, 22.4374f, 19.7115f, 21.0845f, 21.0644f)
                curveTo(20.1889f, 21.9599f, 19.048f, 22.3657f, 17.6019f, 22.5601f)
                curveTo(16.189f, 22.75f, 14.3782f, 22.75f, 12.0674f, 22.75f)
                horizontalLineTo(11.9527f)
                curveTo(9.6419f, 22.75f, 7.8311f, 22.75f, 6.4182f, 22.5601f)
                curveTo(4.9721f, 22.3657f, 3.8312f, 21.9599f, 2.9356f, 21.0644f)
                curveTo(2.0401f, 20.1689f, 1.6343f, 19.0279f, 1.4399f, 17.5818f)
                curveTo(1.25f, 16.1689f, 1.25f, 14.3581f, 1.25f, 12.0473f)
                verticalLineTo(11.9326f)
                curveTo(1.25f, 9.6218f, 1.25f, 7.811f, 1.4399f, 6.3981f)
                curveTo(1.6343f, 4.952f, 2.0401f, 3.811f, 2.9356f, 2.9155f)
                curveTo(4.2885f, 1.5626f, 6.2235f, 1.3134f, 8.9899f, 1.2502f)
                curveTo(9.404f, 1.2407f, 9.7474f, 1.5688f, 9.7568f, 1.9829f)
                close()
                moveTo(17.2606f, 2.75f)
                curveTo(15.0544f, 2.75f, 13.2711f, 4.5304f, 13.2711f, 6.7201f)
                curveTo(13.2711f, 7.2117f, 13.3839f, 7.643f, 13.4996f, 7.9543f)
                curveTo(13.557f, 8.1086f, 13.6137f, 8.2295f, 13.6541f, 8.3086f)
                curveTo(13.6742f, 8.348f, 13.6901f, 8.3766f, 13.6997f, 8.3935f)
                lineTo(13.7091f, 8.4096f)
                curveTo(13.8944f, 8.7049f, 13.8506f, 9.089f, 13.6037f, 9.3349f)
                lineTo(7.87f, 15.0451f)
                curveTo(7.8553f, 15.0598f, 7.8268f, 15.0936f, 7.8005f, 15.1408f)
                curveTo(7.7747f, 15.1871f, 7.7592f, 15.2314f, 7.7531f, 15.2686f)
                curveTo(7.7475f, 15.3025f, 7.7495f, 15.3303f, 7.7584f, 15.358f)
                curveTo(7.7671f, 15.3852f, 7.7916f, 15.4409f, 7.87f, 15.519f)
                lineTo(8.5042f, 16.1506f)
                curveTo(8.5232f, 16.1647f, 8.5527f, 16.184f, 8.59f, 16.2022f)
                curveTo(8.6388f, 16.2261f, 8.6861f, 16.2411f, 8.7262f, 16.2471f)
                curveTo(8.7643f, 16.2527f, 8.7898f, 16.2495f, 8.8079f, 16.2441f)
                curveTo(8.8231f, 16.2395f, 8.8566f, 16.2266f, 8.9057f, 16.1777f)
                lineTo(9.6772f, 15.4093f)
                curveTo(9.9699f, 15.1178f, 10.4431f, 15.1178f, 10.7357f, 15.4093f)
                curveTo(10.8507f, 15.5237f, 10.9465f, 15.5714f, 11.0148f, 15.5922f)
                curveTo(11.0838f, 15.6133f, 11.1522f, 15.6155f, 11.2227f, 15.602f)
                curveTo(11.379f, 15.5721f, 11.5211f, 15.4687f, 11.5865f, 15.386f)
                curveTo(11.677f, 15.2553f, 11.6741f, 15.1418f, 11.6308f, 15.0124f)
                curveTo(11.6067f, 14.9407f, 11.5721f, 14.876f, 11.5419f, 14.8284f)
                curveTo(11.5274f, 14.8055f, 11.5155f, 14.7892f, 11.5091f, 14.7808f)
                curveTo(11.5074f, 14.7785f, 11.5054f, 14.7759f, 11.5054f, 14.7759f)
                curveTo(11.2557f, 14.478f, 11.2748f, 14.0378f, 11.551f, 13.7627f)
                lineTo(11.7714f, 13.5432f)
                curveTo(12.0641f, 13.2518f, 12.5373f, 13.2518f, 12.8299f, 13.5432f)
                curveTo(13.2139f, 13.9256f, 13.4684f, 13.9208f, 13.591f, 13.8976f)
                curveTo(13.7642f, 13.8647f, 13.9255f, 13.7402f, 14.011f, 13.6301f)
                curveTo(14.1236f, 13.4689f, 14.1241f, 13.3249f, 14.0925f, 13.1925f)
                curveTo(14.0751f, 13.1199f, 14.0481f, 13.0565f, 14.0253f, 13.0119f)
                curveTo(14.0142f, 12.9903f, 14.0053f, 12.9753f, 14.0009f, 12.9683f)
                lineTo(13.9999f, 12.9668f)
                lineTo(13.9714f, 12.927f)
                lineTo(13.945f, 12.8744f)
                curveTo(13.9355f, 12.8554f, 13.9203f, 12.8325f, 13.8718f, 12.779f)
                curveTo(13.8702f, 12.7772f, 13.8672f, 12.7741f, 13.863f, 12.7697f)
                curveTo(13.826f, 12.7307f, 13.6958f, 12.5938f, 13.6159f, 12.4504f)
                curveTo(13.4791f, 12.2052f, 13.4412f, 11.9068f, 13.5599f, 11.602f)
                curveTo(13.6513f, 11.3672f, 13.82f, 11.1737f, 13.9758f, 11.0185f)
                lineTo(14.6371f, 10.3599f)
                curveTo(14.9112f, 10.087f, 15.3478f, 10.0672f, 15.6454f, 10.3142f)
                curveTo(15.765f, 10.4135f, 16.0204f, 10.5205f, 16.3848f, 10.596f)
                curveTo(16.7271f, 10.6668f, 17.067f, 10.6902f, 17.2606f, 10.6902f)
                curveTo(19.4668f, 10.6902f, 21.25f, 8.9098f, 21.25f, 6.7201f)
                curveTo(21.25f, 4.5304f, 19.4668f, 2.75f, 17.2606f, 2.75f)
                close()
                moveTo(13.1486f, 15.3763f)
                curveTo(13.1174f, 15.6615f, 13.0159f, 15.9669f, 12.7999f, 16.268f)
                lineTo(12.7948f, 16.2751f)
                lineTo(12.7895f, 16.2821f)
                curveTo(12.5219f, 16.6375f, 12.061f, 16.9687f, 11.5049f, 17.0752f)
                curveTo(11.1118f, 17.1505f, 10.6919f, 17.1088f, 10.2913f, 16.9147f)
                lineTo(9.9642f, 17.2405f)
                curveTo(9.5119f, 17.691f, 8.9717f, 17.7996f, 8.5069f, 17.7309f)
                curveTo(8.0795f, 17.6678f, 7.727f, 17.4603f, 7.5152f, 17.2795f)
                curveTo(7.5006f, 17.267f, 7.4865f, 17.254f, 7.4729f, 17.2405f)
                lineTo(6.8116f, 16.5819f)
                curveTo(6.3296f, 16.1019f, 6.1891f, 15.5381f, 6.2727f, 15.0266f)
                curveTo(6.3486f, 14.5622f, 6.598f, 14.195f, 6.8116f, 13.9823f)
                lineTo(12.1628f, 8.6529f)
                curveTo(12.14f, 8.5979f, 12.1168f, 8.5393f, 12.0937f, 8.4771f)
                curveTo(11.9339f, 8.0475f, 11.7711f, 7.4359f, 11.7711f, 6.7201f)
                curveTo(11.7711f, 3.6962f, 14.2317f, 1.25f, 17.2606f, 1.25f)
                curveTo(20.2894f, 1.25f, 22.75f, 3.6962f, 22.75f, 6.7201f)
                curveTo(22.75f, 9.744f, 20.2894f, 12.1902f, 17.2606f, 12.1902f)
                curveTo(16.9765f, 12.1902f, 16.5339f, 12.1586f, 16.0807f, 12.0648f)
                curveTo(15.84f, 12.015f, 15.5614f, 11.9408f, 15.2909f, 11.8258f)
                lineTo(15.1456f, 11.9705f)
                curveTo(15.1844f, 12.0246f, 15.224f, 12.0862f, 15.2615f, 12.1554f)
                curveTo(15.2657f, 12.1619f, 15.2702f, 12.1689f, 15.2748f, 12.1764f)
                curveTo(15.2984f, 12.2144f, 15.3283f, 12.2655f, 15.3603f, 12.328f)
                curveTo(15.4235f, 12.4514f, 15.4998f, 12.6282f, 15.5514f, 12.8437f)
                curveTo(15.657f, 13.2855f, 15.6581f, 13.9075f, 15.2247f, 14.5117f)
                lineTo(15.2196f, 14.5188f)
                lineTo(15.2144f, 14.5258f)
                curveTo(14.9678f, 14.8532f, 14.5039f, 15.2511f, 13.8705f, 15.3713f)
                curveTo(13.6342f, 15.4161f, 13.392f, 15.4191f, 13.1486f, 15.3763f)
                close()
                moveTo(17.2606f, 5.8235f)
                curveTo(16.7588f, 5.8235f, 16.3573f, 6.2278f, 16.3573f, 6.7201f)
                curveTo(16.3573f, 7.2123f, 16.7588f, 7.6166f, 17.2606f, 7.6166f)
                curveTo(17.7623f, 7.6166f, 18.1639f, 7.2123f, 18.1639f, 6.7201f)
                curveTo(18.1639f, 6.2278f, 17.7623f, 5.8235f, 17.2606f, 5.8235f)
                close()
                moveTo(14.8573f, 6.7201f)
                curveTo(14.8573f, 5.3936f, 15.9362f, 4.3235f, 17.2606f, 4.3235f)
                curveTo(18.585f, 4.3235f, 19.6639f, 5.3936f, 19.6639f, 6.7201f)
                curveTo(19.6639f, 8.0465f, 18.585f, 9.1166f, 17.2606f, 9.1166f)
                curveTo(15.9362f, 9.1166f, 14.8573f, 8.0465f, 14.8573f, 6.7201f)
                close()
            }
        }
            .build()
        return _keySquare2!!
    }

private var _keySquare2: ImageVector? = null
