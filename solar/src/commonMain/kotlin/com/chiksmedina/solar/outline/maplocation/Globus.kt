package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.Globus: ImageVector
    get() {
        if (_globus != null) {
            return _globus!!
        }
        _globus = Builder(
            name = "Globus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.0035f, 1.4998f)
                curveTo(18.2797f, 1.1912f, 18.7539f, 1.1649f, 19.0625f, 1.4412f)
                curveTo(21.3246f, 3.4658f, 22.75f, 6.4104f, 22.75f, 9.687f)
                curveTo(22.75f, 15.4384f, 18.3612f, 20.1647f, 12.75f, 20.6996f)
                verticalLineTo(21.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 21.25f, 14.75f, 21.5858f, 14.75f, 22.0f)
                curveTo(14.75f, 22.4142f, 14.4142f, 22.75f, 14.0f, 22.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 22.75f, 9.25f, 22.4142f, 9.25f, 22.0f)
                curveTo(9.25f, 21.5858f, 9.5858f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(20.7415f)
                curveTo(8.1492f, 20.621f, 5.3754f, 19.2236f, 3.4412f, 17.0625f)
                curveTo(3.1649f, 16.7539f, 3.1912f, 16.2797f, 3.4998f, 16.0035f)
                curveTo(3.8085f, 15.7272f, 4.2826f, 15.7535f, 4.5589f, 16.0622f)
                curveTo(6.311f, 18.0198f, 8.8548f, 19.25f, 11.687f, 19.25f)
                curveTo(16.9685f, 19.25f, 21.25f, 14.9685f, 21.25f, 9.687f)
                curveTo(21.25f, 6.8548f, 20.0198f, 4.311f, 18.0622f, 2.5589f)
                curveTo(17.7535f, 2.2826f, 17.7272f, 1.8085f, 18.0035f, 1.4998f)
                close()
                moveTo(7.2218f, 5.971f)
                curveTo(6.3035f, 7.0589f, 5.75f, 8.4648f, 5.75f, 10.0f)
                curveTo(5.75f, 13.4518f, 8.5482f, 16.25f, 12.0f, 16.25f)
                curveTo(12.0963f, 16.25f, 12.192f, 16.2478f, 12.2872f, 16.2435f)
                curveTo(12.2005f, 15.6345f, 12.2439f, 14.8905f, 12.6285f, 14.1657f)
                curveTo(13.1159f, 13.2472f, 14.1093f, 12.8691f, 14.7862f, 12.7027f)
                curveTo(15.1485f, 12.6137f, 15.4829f, 12.57f, 15.7251f, 12.5483f)
                curveTo(15.8471f, 12.5373f, 15.948f, 12.5317f, 16.0202f, 12.5289f)
                curveTo(16.0564f, 12.5274f, 16.0855f, 12.5267f, 16.1067f, 12.5263f)
                lineTo(16.1324f, 12.5259f)
                lineTo(16.1377f, 12.5259f)
                curveTo(16.8873f, 12.5181f, 17.3089f, 12.3432f, 17.5563f, 12.1648f)
                curveTo(17.8046f, 11.9857f, 17.9513f, 11.7499f, 18.0576f, 11.485f)
                curveTo(18.0669f, 11.4618f, 18.0772f, 11.4394f, 18.0885f, 11.4176f)
                curveTo(18.1942f, 10.9622f, 18.25f, 10.4876f, 18.25f, 10.0f)
                curveTo(18.25f, 8.316f, 17.584f, 6.7876f, 16.5011f, 5.6638f)
                curveTo(16.3786f, 6.0208f, 16.2225f, 6.3565f, 16.0597f, 6.6127f)
                curveTo(15.8488f, 6.9446f, 15.4509f, 7.2668f, 15.143f, 7.4962f)
                curveTo(14.9312f, 7.654f, 14.7121f, 7.787f, 14.5199f, 7.9019f)
                curveTo(14.4965f, 7.9159f, 14.4736f, 7.9296f, 14.451f, 7.943f)
                curveTo(14.2793f, 8.0454f, 14.1309f, 8.134f, 13.9881f, 8.2318f)
                curveTo(13.6814f, 8.4419f, 13.4566f, 8.6588f, 13.3044f, 8.9844f)
                curveTo(13.2636f, 9.0716f, 13.2596f, 9.1586f, 13.2878f, 9.2651f)
                curveTo(13.3463f, 9.4863f, 13.3867f, 9.7365f, 13.3873f, 9.9932f)
                curveTo(13.3901f, 11.1142f, 12.3502f, 11.7596f, 11.4915f, 11.7499f)
                curveTo(9.5067f, 11.7274f, 8.3364f, 10.0614f, 8.1839f, 8.3015f)
                curveTo(8.1115f, 7.4662f, 7.6814f, 6.6229f, 7.2218f, 5.971f)
                close()
                moveTo(8.3284f, 4.9416f)
                curveTo(8.9181f, 5.7376f, 9.5682f, 6.9014f, 9.6783f, 8.1721f)
                curveTo(9.7884f, 9.4426f, 10.5469f, 10.2391f, 11.5085f, 10.25f)
                curveTo(11.6091f, 10.2511f, 11.7211f, 10.211f, 11.8005f, 10.1446f)
                curveTo(11.8744f, 10.0828f, 11.8874f, 10.03f, 11.8873f, 9.9969f)
                curveTo(11.887f, 9.8905f, 11.8696f, 9.7693f, 11.8377f, 9.649f)
                curveTo(11.7401f, 9.2804f, 11.7249f, 8.8208f, 11.9456f, 8.3489f)
                curveTo(12.2508f, 7.6964f, 12.7046f, 7.2929f, 13.1403f, 6.9944f)
                curveTo(13.325f, 6.8678f, 13.5165f, 6.7537f, 13.6839f, 6.654f)
                curveTo(13.7065f, 6.6405f, 13.7287f, 6.6273f, 13.7503f, 6.6144f)
                curveTo(13.9415f, 6.5001f, 14.1022f, 6.4011f, 14.2468f, 6.2933f)
                curveTo(14.5712f, 6.0516f, 14.7501f, 5.8768f, 14.7936f, 5.8083f)
                curveTo(14.9625f, 5.5425f, 15.1509f, 5.0602f, 15.2218f, 4.6433f)
                curveTo(14.281f, 4.0762f, 13.1786f, 3.75f, 12.0f, 3.75f)
                curveTo(10.628f, 3.75f, 9.3592f, 4.1921f, 8.3284f, 4.9416f)
                close()
                moveTo(16.8186f, 13.9807f)
                curveTo(16.6101f, 14.0081f, 16.3885f, 14.0234f, 16.1533f, 14.0258f)
                lineTo(16.1455f, 14.0259f)
                lineTo(16.1347f, 14.026f)
                curveTo(16.1233f, 14.0263f, 16.1046f, 14.0267f, 16.0795f, 14.0277f)
                curveTo(16.0291f, 14.0297f, 15.9533f, 14.0338f, 15.8591f, 14.0423f)
                curveTo(15.6691f, 14.0593f, 15.4133f, 14.0932f, 15.1443f, 14.1594f)
                curveTo(14.5587f, 14.3033f, 14.1248f, 14.5459f, 13.9535f, 14.8688f)
                curveTo(13.7528f, 15.247f, 13.7256f, 15.6562f, 13.767f, 15.9967f)
                curveTo(14.9773f, 15.6407f, 16.035f, 14.9282f, 16.8186f, 13.9807f)
                close()
                moveTo(4.25f, 10.0f)
                curveTo(4.25f, 5.7198f, 7.7198f, 2.25f, 12.0f, 2.25f)
                curveTo(16.2802f, 2.25f, 19.75f, 5.7198f, 19.75f, 10.0f)
                curveTo(19.75f, 14.2802f, 16.2802f, 17.75f, 12.0f, 17.75f)
                curveTo(7.7198f, 17.75f, 4.25f, 14.2802f, 4.25f, 10.0f)
                close()
            }
        }
            .build()
        return _globus!!
    }

private var _globus: ImageVector? = null
