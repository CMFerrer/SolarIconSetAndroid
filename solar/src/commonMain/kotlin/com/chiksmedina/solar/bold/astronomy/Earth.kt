package com.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(
            name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.4365f, 18.2761f)
                curveTo(14.4246f, 16.414f, 17.7182f, 16.414f, 17.7182f, 16.414f)
                curveTo(21.1502f, 16.3782f, 21.6138f, 14.2944f, 21.9237f, 13.2412f)
                curveTo(21.369f, 17.7226f, 17.8494f, 21.2849f, 13.3885f, 21.9046f)
                curveTo(13.0659f, 21.2256f, 12.6837f, 19.6946f, 13.4365f, 18.2761f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.006f, 5.8339f)
                lineTo(4.5944f, 5.4818f)
                curveTo(4.5601f, 5.4525f, 4.5273f, 5.4218f, 4.4961f, 5.3899f)
                curveTo(2.9425f, 7.1521f, 2.0f, 9.466f, 2.0f, 12.0f)
                curveTo(2.0f, 17.4608f, 6.3771f, 21.8992f, 11.8142f, 21.9983f)
                curveTo(11.4608f, 20.9435f, 11.2302f, 19.234f, 12.1116f, 17.5732f)
                curveTo(12.9217f, 16.0465f, 14.5516f, 15.4456f, 15.5899f, 15.1903f)
                curveTo(16.1567f, 15.051f, 16.6778f, 14.9831f, 17.0542f, 14.9493f)
                curveTo(17.2442f, 14.9323f, 17.4018f, 14.9235f, 17.5156f, 14.919f)
                curveTo(17.5726f, 14.9168f, 17.6189f, 14.9156f, 17.6531f, 14.9149f)
                lineTo(17.6952f, 14.9143f)
                lineTo(17.7064f, 14.9143f)
                curveTo(19.0872f, 14.8991f, 19.6231f, 14.4916f, 19.8704f, 14.2132f)
                curveTo(20.1763f, 13.8688f, 20.2962f, 13.4605f, 20.4632f, 12.8917f)
                lineTo(20.4849f, 12.818f)
                curveTo(20.683f, 12.1447f, 21.3156f, 11.7093f, 21.9968f, 11.743f)
                curveTo(21.934f, 9.2535f, 20.9613f, 6.99f, 19.3989f, 5.2727f)
                curveTo(19.3673f, 5.4504f, 19.3297f, 5.6156f, 19.2921f, 5.7618f)
                curveTo(19.1225f, 6.4234f, 18.8378f, 7.1372f, 18.4884f, 7.6674f)
                curveTo(18.1465f, 8.1863f, 17.5392f, 8.65f, 17.1355f, 8.94f)
                curveTo(16.8308f, 9.1589f, 16.5194f, 9.3408f, 16.2628f, 9.4887f)
                lineTo(16.1707f, 9.5417f)
                curveTo(15.939f, 9.675f, 15.7548f, 9.7811f, 15.5794f, 9.897f)
                curveTo(15.2234f, 10.1322f, 15.0099f, 10.3411f, 14.8652f, 10.6241f)
                curveTo(14.9532f, 10.9464f, 15.0157f, 11.3168f, 15.0167f, 11.7041f)
                curveTo(15.0191f, 12.6256f, 14.5474f, 13.3537f, 13.9836f, 13.8081f)
                curveTo(13.4289f, 14.2551f, 12.7112f, 14.5078f, 11.984f, 14.4999f)
                curveTo(9.0342f, 14.4677f, 7.304f, 12.0613f, 7.0812f, 9.5816f)
                curveTo(7.0164f, 8.8606f, 6.692f, 8.0837f, 6.2388f, 7.3599f)
                curveTo(5.798f, 6.6559f, 5.2997f, 6.1047f, 5.006f, 5.8339f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.5752f, 9.4474f)
                curveTo(8.3879f, 7.3632f, 6.7806f, 5.4211f, 6.0003f, 4.7105f)
                lineTo(5.5693f, 4.3419f)
                curveTo(7.3079f, 2.8804f, 9.5513f, 2.0f, 12.0004f, 2.0f)
                curveTo(14.2137f, 2.0f, 16.2592f, 2.7191f, 17.9158f, 3.9364f)
                curveTo(18.1498f, 4.6469f, 17.704f, 6.1316f, 17.2359f, 6.8421f)
                curveTo(17.0663f, 7.0995f, 16.6818f, 7.419f, 16.2602f, 7.7219f)
                curveTo(15.3097f, 8.4048f, 14.1102f, 8.7425f, 13.5004f, 10.0f)
                curveTo(13.326f, 10.3595f, 13.3335f, 10.7108f, 13.4173f, 11.0163f)
                curveTo(13.4776f, 11.2358f, 13.5161f, 11.4745f, 13.5167f, 11.708f)
                curveTo(13.5187f, 12.4629f, 12.7552f, 13.0082f, 12.0004f, 13.0f)
                curveTo(10.0361f, 12.9786f, 8.7502f, 11.3955f, 8.5752f, 9.4474f)
                close()
            }
        }
            .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
