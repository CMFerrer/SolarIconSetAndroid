package com.chiksmedina.solar.outline.essentionalui

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
import com.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.HomeSmile: ImageVector
    get() {
        if (_homeSmile != null) {
            return _homeSmile!!
        }
        _homeSmile = Builder(
            name = "HomeSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.4466f, 15.3975f)
                curveTo(9.1138f, 15.1508f, 8.6441f, 15.2206f, 8.3975f, 15.5534f)
                curveTo(8.1508f, 15.8862f, 8.2206f, 16.3559f, 8.5534f, 16.6025f)
                curveTo(9.5258f, 17.3233f, 10.715f, 17.75f, 12.0f, 17.75f)
                curveTo(13.285f, 17.75f, 14.4742f, 17.3233f, 15.4466f, 16.6025f)
                curveTo(15.7794f, 16.3559f, 15.8492f, 15.8862f, 15.6025f, 15.5534f)
                curveTo(15.3559f, 15.2206f, 14.8862f, 15.1508f, 14.5534f, 15.3975f)
                curveTo(13.825f, 15.9373f, 12.9459f, 16.25f, 12.0f, 16.25f)
                curveTo(11.0541f, 16.25f, 10.175f, 15.9373f, 9.4466f, 15.3975f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(11.2919f, 1.25f, 10.6485f, 1.4528f, 9.9506f, 1.7922f)
                curveTo(9.2759f, 2.1203f, 8.4964f, 2.6041f, 7.5229f, 3.2083f)
                lineTo(5.4563f, 4.4909f)
                curveTo(4.5351f, 5.0626f, 3.7974f, 5.5204f, 3.2289f, 5.9558f)
                curveTo(2.6402f, 6.4067f, 2.1879f, 6.8659f, 1.8613f, 7.4626f)
                curveTo(1.5353f, 8.0581f, 1.3886f, 8.6917f, 1.3182f, 9.4407f)
                curveTo(1.25f, 10.1665f, 1.25f, 11.0541f, 1.25f, 12.1672f)
                verticalLineTo(13.7799f)
                curveTo(1.25f, 15.6837f, 1.25f, 17.1866f, 1.4027f, 18.3616f)
                curveTo(1.5594f, 19.567f, 1.8886f, 20.5401f, 2.6324f, 21.3094f)
                curveTo(3.3796f, 22.0824f, 4.3305f, 22.4277f, 5.5076f, 22.5914f)
                curveTo(6.6485f, 22.75f, 8.1056f, 22.75f, 9.9418f, 22.75f)
                horizontalLineTo(14.0581f)
                curveTo(15.8944f, 22.75f, 17.3515f, 22.75f, 18.4924f, 22.5914f)
                curveTo(19.6695f, 22.4277f, 20.6204f, 22.0824f, 21.3676f, 21.3094f)
                curveTo(22.1114f, 20.5401f, 22.4406f, 19.567f, 22.5973f, 18.3616f)
                curveTo(22.75f, 17.1866f, 22.75f, 15.6838f, 22.75f, 13.7799f)
                verticalLineTo(12.1672f)
                curveTo(22.75f, 11.0541f, 22.75f, 10.1665f, 22.6818f, 9.4407f)
                curveTo(22.6114f, 8.6917f, 22.4646f, 8.0581f, 22.1387f, 7.4626f)
                curveTo(21.8121f, 6.8659f, 21.3599f, 6.4067f, 20.7711f, 5.9558f)
                curveTo(20.2026f, 5.5204f, 19.4649f, 5.0626f, 18.5437f, 4.4909f)
                lineTo(16.4771f, 3.2083f)
                curveTo(15.5036f, 2.6041f, 14.7241f, 2.1203f, 14.0494f, 1.7922f)
                curveTo(13.3515f, 1.4528f, 12.7081f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(8.2795f, 4.5041f)
                curveTo(9.2953f, 3.8737f, 10.0095f, 3.4315f, 10.6065f, 3.1412f)
                curveTo(11.1882f, 2.8583f, 11.6002f, 2.75f, 12.0f, 2.75f)
                curveTo(12.3998f, 2.75f, 12.8118f, 2.8583f, 13.3935f, 3.1412f)
                curveTo(13.9905f, 3.4315f, 14.7047f, 3.8737f, 15.7205f, 4.5041f)
                lineTo(17.7205f, 5.7454f)
                curveTo(18.6813f, 6.3417f, 19.3559f, 6.7614f, 19.8591f, 7.1467f)
                curveTo(20.3487f, 7.5216f, 20.6303f, 7.8311f, 20.8229f, 8.1828f)
                curveTo(21.0162f, 8.5359f, 21.129f, 8.9487f, 21.1884f, 9.581f)
                curveTo(21.2492f, 10.2286f, 21.25f, 11.0458f, 21.25f, 12.2039f)
                verticalLineTo(13.725f)
                curveTo(21.25f, 15.6959f, 21.2485f, 17.1012f, 21.1098f, 18.1683f)
                curveTo(20.9736f, 19.2163f, 20.717f, 19.8244f, 20.2892f, 20.2669f)
                curveTo(19.8649f, 20.7058f, 19.2871f, 20.9664f, 18.2858f, 21.1057f)
                curveTo(17.2602f, 21.2483f, 15.9075f, 21.25f, 14.0f, 21.25f)
                horizontalLineTo(10.0f)
                curveTo(8.0925f, 21.25f, 6.7398f, 21.2483f, 5.7142f, 21.1057f)
                curveTo(4.7129f, 20.9664f, 4.1351f, 20.7058f, 3.7108f, 20.2669f)
                curveTo(3.283f, 19.8244f, 3.0264f, 19.2163f, 2.8902f, 18.1683f)
                curveTo(2.7515f, 17.1012f, 2.75f, 15.6959f, 2.75f, 13.725f)
                verticalLineTo(12.2039f)
                curveTo(2.75f, 11.0458f, 2.7508f, 10.2286f, 2.8116f, 9.581f)
                curveTo(2.871f, 8.9487f, 2.9839f, 8.5359f, 3.1771f, 8.1828f)
                curveTo(3.3696f, 7.8311f, 3.6513f, 7.5216f, 4.1409f, 7.1467f)
                curveTo(4.6441f, 6.7614f, 5.3187f, 6.3417f, 6.2795f, 5.7454f)
                lineTo(8.2795f, 4.5041f)
                close()
            }
        }
            .build()
        return _homeSmile!!
    }

private var _homeSmile: ImageVector? = null
