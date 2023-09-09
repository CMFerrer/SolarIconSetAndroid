package com.chiksmedina.solar.outline.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ShoppingEcommerceGroup

public val ShoppingEcommerceGroup.BagHeart: ImageVector
    get() {
        if (_bagHeart != null) {
            return _bagHeart!!
        }
        _bagHeart = Builder(name = "BagHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(10.7574f, 2.75f, 9.75f, 3.7574f, 9.75f, 5.0f)
                verticalLineTo(5.2599f)
                curveTo(10.3071f, 5.25f, 10.9183f, 5.25f, 11.5891f, 5.25f)
                horizontalLineTo(12.4109f)
                curveTo(13.0817f, 5.25f, 13.6929f, 5.25f, 14.25f, 5.2599f)
                verticalLineTo(5.0f)
                curveTo(14.25f, 3.7574f, 13.2426f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(15.75f, 5.3279f)
                verticalLineTo(5.0f)
                curveTo(15.75f, 2.9289f, 14.0711f, 1.25f, 12.0f, 1.25f)
                curveTo(9.9289f, 1.25f, 8.25f, 2.9289f, 8.25f, 5.0f)
                verticalLineTo(5.3279f)
                curveTo(8.1073f, 5.3402f, 7.9693f, 5.3544f, 7.8361f, 5.3709f)
                curveTo(6.8261f, 5.4957f, 5.9935f, 5.7578f, 5.2862f, 6.3448f)
                curveTo(4.5789f, 6.9318f, 4.1678f, 7.7019f, 3.859f, 8.6716f)
                curveTo(3.5598f, 9.6113f, 3.3333f, 10.8194f, 3.0485f, 12.3381f)
                lineTo(3.0278f, 12.4484f)
                curveTo(2.6261f, 14.5912f, 2.3094f, 16.2799f, 2.2513f, 17.6112f)
                curveTo(2.1917f, 18.9758f, 2.3948f, 20.106f, 3.1645f, 21.0335f)
                curveTo(3.9343f, 21.961f, 5.0077f, 22.3689f, 6.3599f, 22.5618f)
                curveTo(7.6791f, 22.75f, 9.3973f, 22.75f, 11.5774f, 22.75f)
                horizontalLineTo(12.4226f)
                curveTo(14.6027f, 22.75f, 16.3208f, 22.75f, 17.6401f, 22.5618f)
                curveTo(18.9923f, 22.3689f, 20.0657f, 21.961f, 20.8355f, 21.0335f)
                curveTo(21.6052f, 20.106f, 21.8082f, 18.9758f, 21.7487f, 17.6112f)
                curveTo(21.6906f, 16.2799f, 21.3739f, 14.5912f, 20.9721f, 12.4484f)
                lineTo(20.9515f, 12.3381f)
                curveTo(20.6667f, 10.8194f, 20.4402f, 9.6113f, 20.141f, 8.6716f)
                curveTo(19.8322f, 7.7019f, 19.4211f, 6.9318f, 18.7138f, 6.3448f)
                curveTo(18.0065f, 5.7578f, 17.1739f, 5.4957f, 16.1639f, 5.3709f)
                curveTo(16.0306f, 5.3544f, 15.8927f, 5.3402f, 15.75f, 5.3279f)
                close()
                moveTo(8.02f, 6.8596f)
                curveTo(7.1645f, 6.9653f, 6.6477f, 7.1641f, 6.2441f, 7.4991f)
                curveTo(5.8405f, 7.8341f, 5.5499f, 8.3053f, 5.2883f, 9.1267f)
                curveTo(5.0205f, 9.9679f, 4.8097f, 11.0846f, 4.5136f, 12.6639f)
                curveTo(4.0979f, 14.8811f, 3.8028f, 16.4647f, 3.7499f, 17.6766f)
                curveTo(3.6979f, 18.8679f, 3.889f, 19.5576f, 4.3188f, 20.0756f)
                curveTo(4.7486f, 20.5935f, 5.3914f, 20.9084f, 6.5718f, 21.0768f)
                curveTo(7.7727f, 21.2482f, 9.3836f, 21.25f, 11.6394f, 21.25f)
                horizontalLineTo(12.3606f)
                curveTo(14.6164f, 21.25f, 16.2273f, 21.2482f, 17.4282f, 21.0768f)
                curveTo(18.6086f, 20.9084f, 19.2513f, 20.5935f, 19.6812f, 20.0756f)
                curveTo(20.111f, 19.5576f, 20.3021f, 18.8679f, 20.2501f, 17.6766f)
                curveTo(20.1972f, 16.4647f, 19.9021f, 14.8811f, 19.4864f, 12.6639f)
                curveTo(19.1903f, 11.0846f, 18.9795f, 9.9679f, 18.7117f, 9.1267f)
                curveTo(18.4501f, 8.3053f, 18.1595f, 7.8341f, 17.7559f, 7.4991f)
                curveTo(17.3523f, 7.1641f, 16.8355f, 6.9653f, 15.98f, 6.8596f)
                curveTo(15.1038f, 6.7513f, 13.9674f, 6.75f, 12.3606f, 6.75f)
                horizontalLineTo(11.6394f)
                curveTo(10.0326f, 6.75f, 8.8961f, 6.7513f, 8.02f, 6.8596f)
                close()
                moveTo(10.2419f, 12.2896f)
                curveTo(10.0126f, 12.37f, 9.75f, 12.6207f, 9.75f, 13.1967f)
                curveTo(9.75f, 13.4113f, 9.8912f, 13.7423f, 10.2595f, 14.1681f)
                curveTo(10.6081f, 14.5712f, 11.0686f, 14.9542f, 11.4865f, 15.2609f)
                curveTo(11.7128f, 15.4269f, 11.8202f, 15.5034f, 11.9061f, 15.5488f)
                curveTo(11.9605f, 15.5775f, 11.9756f, 15.5776f, 12.0f, 15.5776f)
                curveTo(12.0244f, 15.5776f, 12.0395f, 15.5775f, 12.0939f, 15.5488f)
                curveTo(12.1798f, 15.5034f, 12.2872f, 15.4269f, 12.5135f, 15.2609f)
                curveTo(12.9314f, 14.9542f, 13.3919f, 14.5712f, 13.7405f, 14.1681f)
                curveTo(14.1088f, 13.7423f, 14.25f, 13.4113f, 14.25f, 13.1967f)
                curveTo(14.25f, 12.6207f, 13.9874f, 12.37f, 13.7581f, 12.2896f)
                curveTo(13.5078f, 12.2019f, 13.0442f, 12.2299f, 12.5187f, 12.7331f)
                curveTo(12.2286f, 13.0108f, 11.7713f, 13.0108f, 11.4813f, 12.7331f)
                curveTo(10.9558f, 12.2299f, 10.4922f, 12.2019f, 10.2419f, 12.2896f)
                close()
                moveTo(12.0f, 11.2343f)
                curveTo(11.2837f, 10.7628f, 10.475f, 10.6184f, 9.7457f, 10.8741f)
                curveTo(8.8125f, 11.2012f, 8.25f, 12.0995f, 8.25f, 13.1967f)
                curveTo(8.25f, 13.9666f, 8.6912f, 14.6479f, 9.1249f, 15.1493f)
                curveTo(9.5782f, 15.6735f, 10.1391f, 16.1327f, 10.5992f, 16.4703f)
                curveTo(10.6225f, 16.4874f, 10.646f, 16.5047f, 10.6697f, 16.5223f)
                curveTo(11.0209f, 16.782f, 11.4207f, 17.0775f, 12.0f, 17.0776f)
                curveTo(12.5793f, 17.0776f, 12.979f, 16.782f, 13.3303f, 16.5223f)
                curveTo(13.354f, 16.5047f, 13.3775f, 16.4874f, 13.4008f, 16.4703f)
                curveTo(13.8609f, 16.1327f, 14.4218f, 15.6735f, 14.8751f, 15.1493f)
                curveTo(15.3088f, 14.6479f, 15.75f, 13.9666f, 15.75f, 13.1967f)
                curveTo(15.75f, 12.0995f, 15.1875f, 11.2012f, 14.2543f, 10.8741f)
                curveTo(13.525f, 10.6184f, 12.7163f, 10.7628f, 12.0f, 11.2343f)
                close()
            }
        }
        .build()
        return _bagHeart!!
    }

private var _bagHeart: ImageVector? = null
