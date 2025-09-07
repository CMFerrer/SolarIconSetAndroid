package com.chiksmedina.solar.broken.essentionalui

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
import com.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(
            name = "Cat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.9801f, 9.0625f)
                lineTo(20.7301f, 9.0654f)
                verticalLineTo(9.0625f)
                horizontalLineTo(19.9801f)
                close()
                moveTo(4.0199f, 9.0625f)
                lineTo(3.2699f, 9.0625f)
                lineTo(3.2699f, 9.0654f)
                lineTo(4.0199f, 9.0625f)
                close()
                moveTo(19.0993f, 10.6602f)
                lineTo(18.5268f, 11.1447f)
                lineTo(18.6114f, 11.2447f)
                lineTo(18.725f, 11.3101f)
                lineTo(19.0993f, 10.6602f)
                close()
                moveTo(18.8279f, 9.3955f)
                curveTo(18.494f, 9.1503f, 18.0246f, 9.2222f, 17.7795f, 9.5561f)
                curveTo(17.5343f, 9.89f, 17.6063f, 10.3594f, 17.9401f, 10.6045f)
                lineTo(18.8279f, 9.3955f)
                close()
                moveTo(4.0199f, 15.0f)
                lineTo(3.2699f, 15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0199f)
                close()
                moveTo(6.0599f, 10.6045f)
                curveTo(6.3938f, 10.3594f, 6.4657f, 9.89f, 6.2205f, 9.5561f)
                curveTo(5.9754f, 9.2222f, 5.506f, 9.1503f, 5.1721f, 9.3955f)
                lineTo(6.0599f, 10.6045f)
                close()
                moveTo(12.0f, 5.6564f)
                curveTo(11.2279f, 5.6564f, 10.7904f, 5.6974f, 10.4437f, 5.74f)
                curveTo(10.1041f, 5.7818f, 9.9316f, 5.8125f, 9.606f, 5.8125f)
                verticalLineTo(7.3125f)
                curveTo(10.0465f, 7.3125f, 10.3308f, 7.2652f, 10.6266f, 7.2288f)
                curveTo(10.9153f, 7.1934f, 11.2918f, 7.1564f, 12.0f, 7.1564f)
                verticalLineTo(5.6564f)
                close()
                moveTo(12.0f, 7.1564f)
                curveTo(12.7083f, 7.1564f, 13.0847f, 7.1934f, 13.3734f, 7.2288f)
                curveTo(13.6692f, 7.2652f, 13.9536f, 7.3125f, 14.394f, 7.3125f)
                verticalLineTo(5.8125f)
                curveTo(14.0684f, 5.8125f, 13.896f, 5.7818f, 13.5563f, 5.74f)
                curveTo(13.2097f, 5.6974f, 12.7721f, 5.6564f, 12.0f, 5.6564f)
                verticalLineTo(7.1564f)
                close()
                moveTo(14.394f, 7.3125f)
                curveTo(14.6069f, 7.3125f, 14.8057f, 7.2519f, 14.9494f, 7.1987f)
                curveTo(15.1051f, 7.141f, 15.2662f, 7.0647f, 15.4208f, 6.9851f)
                curveTo(15.7257f, 6.828f, 16.0797f, 6.6181f, 16.4042f, 6.4313f)
                curveTo(16.7431f, 6.2361f, 17.064f, 6.0575f, 17.3512f, 5.9277f)
                curveTo(17.6589f, 5.7887f, 17.8349f, 5.7501f, 17.9053f, 5.7501f)
                verticalLineTo(4.2501f)
                curveTo(17.4968f, 4.2501f, 17.0743f, 4.4068f, 16.7336f, 4.5608f)
                curveTo(16.3725f, 4.7239f, 15.9951f, 4.9359f, 15.6557f, 5.1314f)
                curveTo(15.3019f, 5.3351f, 14.9976f, 5.5158f, 14.7338f, 5.6517f)
                curveTo(14.6041f, 5.7185f, 14.5034f, 5.7643f, 14.4284f, 5.7921f)
                curveTo(14.3415f, 5.8243f, 14.3408f, 5.8125f, 14.394f, 5.8125f)
                verticalLineTo(7.3125f)
                close()
                moveTo(17.9053f, 5.7501f)
                curveTo(18.2495f, 5.7501f, 18.58f, 5.8527f, 18.8122f, 6.0527f)
                curveTo(19.0237f, 6.2349f, 19.2301f, 6.5623f, 19.2301f, 7.1876f)
                horizontalLineTo(20.7301f)
                curveTo(20.7301f, 6.1879f, 20.3778f, 5.4216f, 19.7913f, 4.9163f)
                curveTo(19.2255f, 4.4288f, 18.5186f, 4.2501f, 17.9053f, 4.2501f)
                verticalLineTo(5.7501f)
                close()
                moveTo(19.2301f, 7.1876f)
                verticalLineTo(9.0625f)
                horizontalLineTo(20.7301f)
                verticalLineTo(7.1876f)
                horizontalLineTo(19.2301f)
                close()
                moveTo(9.606f, 5.8125f)
                curveTo(9.6593f, 5.8125f, 9.6586f, 5.8243f, 9.5716f, 5.7921f)
                curveTo(9.4967f, 5.7643f, 9.396f, 5.7185f, 9.2662f, 5.6517f)
                curveTo(9.0025f, 5.5158f, 8.6981f, 5.335f, 8.3444f, 5.1313f)
                curveTo(8.0049f, 4.9358f, 7.6275f, 4.7238f, 7.2664f, 4.5607f)
                curveTo(6.9258f, 4.4068f, 6.5032f, 4.25f, 6.0948f, 4.25f)
                verticalLineTo(5.75f)
                curveTo(6.1651f, 5.75f, 6.3411f, 5.7886f, 6.6488f, 5.9276f)
                curveTo(6.936f, 6.0574f, 7.2569f, 6.236f, 7.5958f, 6.4312f)
                curveTo(7.9204f, 6.6181f, 8.2744f, 6.828f, 8.5792f, 6.9851f)
                curveTo(8.7338f, 7.0647f, 8.8949f, 7.141f, 9.0506f, 7.1987f)
                curveTo(9.1944f, 7.2519f, 9.3932f, 7.3125f, 9.606f, 7.3125f)
                verticalLineTo(5.8125f)
                close()
                moveTo(6.0948f, 4.25f)
                curveTo(5.4814f, 4.25f, 4.7745f, 4.4287f, 4.2087f, 4.9162f)
                curveTo(3.6222f, 5.4215f, 3.2699f, 6.1878f, 3.2699f, 7.1875f)
                horizontalLineTo(4.7699f)
                curveTo(4.7699f, 6.5622f, 4.9763f, 6.2347f, 5.1878f, 6.0526f)
                curveTo(5.42f, 5.8525f, 5.7505f, 5.75f, 6.0948f, 5.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(3.2699f, 7.1875f)
                verticalLineTo(9.0625f)
                horizontalLineTo(4.7699f)
                verticalLineTo(7.1875f)
                horizontalLineTo(3.2699f)
                close()
                moveTo(12.0f, 20.75f)
                curveTo(13.431f, 20.75f, 15.5401f, 20.4654f, 17.3209f, 19.6462f)
                curveTo(19.1035f, 18.8262f, 20.7301f, 17.3734f, 20.7301f, 15.0f)
                horizontalLineTo(19.2301f)
                curveTo(19.2301f, 16.5328f, 18.2232f, 17.58f, 16.694f, 18.2835f)
                curveTo(15.1631f, 18.9877f, 13.2822f, 19.25f, 12.0f, 19.25f)
                verticalLineTo(20.75f)
                close()
                moveTo(19.6719f, 10.1758f)
                curveTo(19.437f, 9.8982f, 19.1575f, 9.6375f, 18.8279f, 9.3955f)
                lineTo(17.9401f, 10.6045f)
                curveTo(18.1808f, 10.7813f, 18.3726f, 10.9625f, 18.5268f, 11.1447f)
                lineTo(19.6719f, 10.1758f)
                close()
                moveTo(19.2301f, 9.0596f)
                curveTo(19.2293f, 9.2578f, 19.1888f, 9.6701f, 19.0916f, 9.955f)
                curveTo(19.0374f, 10.1139f, 19.0062f, 10.1101f, 19.0627f, 10.0649f)
                curveTo(19.1075f, 10.0289f, 19.1902f, 9.984f, 19.3002f, 9.9785f)
                curveTo(19.4051f, 9.9732f, 19.468f, 10.007f, 19.4737f, 10.0103f)
                lineTo(18.725f, 11.3101f)
                curveTo(18.9057f, 11.4142f, 19.1272f, 11.4891f, 19.3759f, 11.4766f)
                curveTo(19.6297f, 11.4637f, 19.8412f, 11.3633f, 20.0013f, 11.2349f)
                curveTo(20.2881f, 11.0048f, 20.4331f, 10.6686f, 20.5113f, 10.4392f)
                curveTo(20.679f, 9.9476f, 20.7289f, 9.3594f, 20.7301f, 9.0654f)
                lineTo(19.2301f, 9.0596f)
                close()
                moveTo(12.0f, 19.25f)
                curveTo(10.7178f, 19.25f, 8.8369f, 18.9877f, 7.3059f, 18.2835f)
                curveTo(5.7768f, 17.5801f, 4.7699f, 16.5328f, 4.7699f, 15.0f)
                horizontalLineTo(3.2699f)
                curveTo(3.2699f, 17.3734f, 4.8965f, 18.8262f, 6.6791f, 19.6462f)
                curveTo(8.4599f, 20.4654f, 10.5689f, 20.75f, 12.0f, 20.75f)
                verticalLineTo(19.25f)
                close()
                moveTo(4.7699f, 15.0f)
                curveTo(4.7699f, 14.2119f, 4.7135f, 13.5629f, 4.7889f, 12.8724f)
                curveTo(4.8594f, 12.227f, 5.0421f, 11.6541f, 5.4732f, 11.1447f)
                lineTo(4.3281f, 10.1758f)
                curveTo(3.6473f, 10.9804f, 3.3897f, 11.8682f, 3.2978f, 12.7095f)
                curveTo(3.2108f, 13.5058f, 3.2699f, 14.3696f, 3.2699f, 15.0f)
                lineTo(4.7699f, 15.0f)
                close()
                moveTo(5.4732f, 11.1447f)
                curveTo(5.6274f, 10.9625f, 5.8192f, 10.7813f, 6.0599f, 10.6045f)
                lineTo(5.1721f, 9.3955f)
                curveTo(4.8425f, 9.6375f, 4.563f, 9.8982f, 4.3281f, 10.1758f)
                lineTo(5.4732f, 11.1447f)
                close()
                moveTo(3.2699f, 9.0654f)
                curveTo(3.2711f, 9.3594f, 3.321f, 9.9476f, 3.4887f, 10.4392f)
                curveTo(3.5669f, 10.6686f, 3.7119f, 11.0048f, 3.9987f, 11.2349f)
                curveTo(4.1588f, 11.3633f, 4.3703f, 11.4637f, 4.6241f, 11.4766f)
                curveTo(4.8728f, 11.4891f, 5.0943f, 11.4142f, 5.275f, 11.3101f)
                lineTo(4.5263f, 10.0103f)
                curveTo(4.532f, 10.007f, 4.5949f, 9.9732f, 4.6998f, 9.9785f)
                curveTo(4.8098f, 9.984f, 4.8925f, 10.0289f, 4.9373f, 10.0649f)
                curveTo(4.9938f, 10.1101f, 4.9626f, 10.1139f, 4.9084f, 9.955f)
                curveTo(4.8112f, 9.6701f, 4.7707f, 9.2578f, 4.7699f, 9.0596f)
                lineTo(3.2699f, 9.0654f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.826f, 15.9999f)
                curveTo(12.826f, 16.1725f, 12.465f, 16.3124f, 12.0196f, 16.3124f)
                curveTo(11.5742f, 16.3124f, 11.2131f, 16.1725f, 11.2131f, 15.9999f)
                curveTo(11.2131f, 15.8273f, 11.5742f, 15.6874f, 12.0196f, 15.6874f)
                curveTo(12.465f, 15.6874f, 12.826f, 15.8273f, 12.826f, 15.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 13.5938f)
                curveTo(15.5f, 14.0252f, 15.2834f, 14.375f, 15.0161f, 14.375f)
                curveTo(14.7489f, 14.375f, 14.5323f, 14.0252f, 14.5323f, 13.5938f)
                curveTo(14.5323f, 13.1623f, 14.7489f, 12.8125f, 15.0161f, 12.8125f)
                curveTo(15.2834f, 12.8125f, 15.5f, 13.1623f, 15.5f, 13.5938f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 13.5938f)
                curveTo(9.5f, 14.0252f, 9.2834f, 14.375f, 9.0161f, 14.375f)
                curveTo(8.7489f, 14.375f, 8.5323f, 14.0252f, 8.5323f, 13.5938f)
                curveTo(8.5323f, 13.1623f, 8.7489f, 12.8125f, 9.0161f, 12.8125f)
                curveTo(9.2834f, 12.8125f, 9.5f, 13.1623f, 9.5f, 13.5938f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0004f, 15.4688f)
                curveTo(21.5165f, 15.1562f, 19.4197f, 14.375f, 18.6133f, 14.375f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.3871f, 17.9688f)
                curveTo(19.9033f, 17.6562f, 18.7742f, 16.875f, 17.9678f, 16.875f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 15.4688f)
                curveTo(2.4839f, 15.1562f, 4.5806f, 14.375f, 5.3871f, 14.375f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.6128f, 17.9688f)
                curveTo(4.0967f, 17.6562f, 5.2257f, 16.875f, 6.0321f, 16.875f)
            }
        }
            .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
