package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

val SportsGroup.Running2: ImageVector
    get() {
        if (_running2 != null) {
            return _running2!!
        }
        _running2 = Builder(
            name = "Running2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.5f, 2.75f)
                curveTo(17.5335f, 2.75f, 16.75f, 3.5335f, 16.75f, 4.5f)
                curveTo(16.75f, 5.4665f, 17.5335f, 6.25f, 18.5f, 6.25f)
                curveTo(19.4665f, 6.25f, 20.25f, 5.4665f, 20.25f, 4.5f)
                curveTo(20.25f, 3.5335f, 19.4665f, 2.75f, 18.5f, 2.75f)
                close()
                moveTo(15.25f, 4.5f)
                curveTo(15.25f, 2.7051f, 16.7051f, 1.25f, 18.5f, 1.25f)
                curveTo(20.2949f, 1.25f, 21.75f, 2.7051f, 21.75f, 4.5f)
                curveTo(21.75f, 6.2949f, 20.2949f, 7.75f, 18.5f, 7.75f)
                curveTo(16.7051f, 7.75f, 15.25f, 6.2949f, 15.25f, 4.5f)
                close()
                moveTo(13.6866f, 6.6613f)
                lineTo(13.6921f, 6.6636f)
                curveTo(14.8765f, 7.1511f, 15.8611f, 8.045f, 16.4389f, 9.2008f)
                curveTo(17.0669f, 10.4567f, 18.3505f, 11.25f, 19.7546f, 11.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 11.25f, 21.75f, 11.5858f, 21.75f, 12.0f)
                curveTo(21.75f, 12.4142f, 21.4142f, 12.75f, 21.0f, 12.75f)
                horizontalLineTo(19.7546f)
                curveTo(17.7823f, 12.75f, 15.9793f, 11.6357f, 15.0973f, 9.8716f)
                curveTo(14.6864f, 9.0499f, 13.9811f, 8.4047f, 13.1211f, 8.0507f)
                curveTo(11.7575f, 7.4894f, 11.3248f, 7.331f, 10.5011f, 7.3909f)
                curveTo(9.3585f, 7.474f, 8.3081f, 8.0512f, 5.8062f, 9.4727f)
                lineTo(4.3705f, 10.2884f)
                curveTo(4.0104f, 10.4931f, 3.5525f, 10.367f, 3.3479f, 10.0069f)
                curveTo(3.1433f, 9.6467f, 3.2694f, 9.1889f, 3.6295f, 8.9843f)
                lineTo(5.0652f, 8.1685f)
                curveTo(5.1231f, 8.1356f, 5.1805f, 8.103f, 5.2374f, 8.0707f)
                curveTo(7.5111f, 6.7783f, 8.8708f, 6.0055f, 10.3924f, 5.8948f)
                curveTo(11.6095f, 5.8063f, 12.346f, 6.1095f, 13.6866f, 6.6613f)
                close()
                moveTo(13.5546f, 10.4956f)
                curveTo(13.8333f, 10.8021f, 13.8107f, 11.2765f, 13.5042f, 11.5551f)
                curveTo(13.3246f, 11.7184f, 13.1455f, 11.8778f, 12.9703f, 12.0338f)
                curveTo(12.6896f, 12.2837f, 12.4189f, 12.5247f, 12.1723f, 12.7582f)
                curveTo(11.9768f, 12.9432f, 11.8172f, 13.1045f, 11.7008f, 13.2386f)
                curveTo(11.6068f, 13.3469f, 11.5689f, 13.4064f, 11.5577f, 13.424f)
                curveTo(11.5532f, 13.431f, 11.553f, 13.4313f, 11.5552f, 13.4254f)
                curveTo(11.4378f, 13.742f, 11.4535f, 14.0927f, 11.5987f, 14.3976f)
                curveTo(11.6411f, 14.4866f, 11.7285f, 14.6084f, 11.962f, 14.8163f)
                curveTo(12.1997f, 15.0279f, 12.53f, 15.2787f, 13.0174f, 15.6481f)
                curveTo(13.0425f, 15.6671f, 13.0673f, 15.6858f, 13.0917f, 15.7043f)
                curveTo(13.6528f, 16.1291f, 14.0408f, 16.4228f, 14.3362f, 16.7946f)
                curveTo(14.6641f, 17.2075f, 14.9014f, 17.6848f, 15.0324f, 18.1955f)
                curveTo(15.1504f, 18.6555f, 15.1502f, 19.1421f, 15.15f, 19.8459f)
                curveTo(15.15f, 19.8765f, 15.15f, 19.9076f, 15.15f, 19.939f)
                verticalLineTo(22.0f)
                curveTo(15.15f, 22.4142f, 14.8142f, 22.75f, 14.4f, 22.75f)
                curveTo(13.9858f, 22.75f, 13.65f, 22.4142f, 13.65f, 22.0f)
                verticalLineTo(19.939f)
                curveTo(13.65f, 19.1064f, 13.6445f, 18.8218f, 13.5794f, 18.5682f)
                curveTo(13.5008f, 18.2618f, 13.3585f, 17.9754f, 13.1617f, 17.7277f)
                curveTo(12.9989f, 17.5228f, 12.7753f, 17.3465f, 12.1117f, 16.8437f)
                lineTo(12.0875f, 16.8254f)
                curveTo(11.6303f, 16.479f, 11.2521f, 16.1925f, 10.9647f, 15.9367f)
                curveTo(10.668f, 15.6727f, 10.4117f, 15.3936f, 10.2446f, 15.0428f)
                curveTo(9.925f, 14.372f, 9.8905f, 13.6005f, 10.1488f, 12.9038f)
                curveTo(10.2412f, 12.6546f, 10.4193f, 12.4267f, 10.5678f, 12.2556f)
                curveTo(10.7314f, 12.067f, 10.9318f, 11.8669f, 11.1412f, 11.6688f)
                curveTo(11.4004f, 11.4234f, 11.7063f, 11.1508f, 12.0024f, 10.8871f)
                curveTo(12.1735f, 10.7345f, 12.3414f, 10.5849f, 12.4952f, 10.4452f)
                curveTo(12.8017f, 10.1666f, 13.276f, 10.1891f, 13.5546f, 10.4956f)
                close()
                moveTo(9.4801f, 16.4238f)
                curveTo(9.7984f, 16.689f, 9.8413f, 17.1619f, 9.5762f, 17.4801f)
                lineTo(8.5754f, 18.6811f)
                curveTo(8.5428f, 18.7202f, 8.5107f, 18.7588f, 8.4789f, 18.7969f)
                curveTo(7.8369f, 19.5685f, 7.3655f, 20.135f, 6.7076f, 20.4432f)
                curveTo(6.0496f, 20.7513f, 5.3127f, 20.7508f, 4.3089f, 20.7501f)
                curveTo(4.2593f, 20.75f, 4.209f, 20.75f, 4.1581f, 20.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 20.75f, 2.25f, 20.4142f, 2.25f, 20.0f)
                curveTo(2.25f, 19.5858f, 2.5858f, 19.25f, 3.0f, 19.25f)
                horizontalLineTo(4.1581f)
                curveTo(5.3797f, 19.25f, 5.754f, 19.2334f, 6.0713f, 19.0848f)
                curveTo(6.3887f, 18.9361f, 6.641f, 18.6593f, 7.4231f, 17.7208f)
                lineTo(8.4238f, 16.5199f)
                curveTo(8.689f, 16.2017f, 9.1619f, 16.1587f, 9.4801f, 16.4238f)
                close()
            }
        }
            .build()
        return _running2!!
    }

private var _running2: ImageVector? = null
