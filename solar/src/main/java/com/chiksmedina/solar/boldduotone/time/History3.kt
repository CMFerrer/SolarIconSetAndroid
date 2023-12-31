package com.chiksmedina.solar.boldduotone.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TimeGroup

val TimeGroup.History3: ImageVector
    get() {
        if (_history3 != null) {
            return _history3!!
        }
        _history3 = Builder(
            name = "History3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 12.4142f, 21.5858f, 12.75f, 22.0f, 12.75f)
                curveTo(22.4142f, 12.75f, 22.75f, 12.4142f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                curveTo(11.5858f, 1.25f, 11.25f, 1.5858f, 11.25f, 2.0f)
                curveTo(11.25f, 2.4142f, 11.5858f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 8.25f)
                curveTo(12.4142f, 8.25f, 12.75f, 8.5858f, 12.75f, 9.0f)
                verticalLineTo(12.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 12.25f, 16.75f, 12.5858f, 16.75f, 13.0f)
                curveTo(16.75f, 13.4142f, 16.4142f, 13.75f, 16.0f, 13.75f)
                horizontalLineTo(12.0f)
                curveTo(11.5858f, 13.75f, 11.25f, 13.4142f, 11.25f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(11.25f, 8.5858f, 11.5858f, 8.25f, 12.0f, 8.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(9.0996f, 2.3976f)
                curveTo(9.2487f, 2.784f, 9.0564f, 3.2182f, 8.67f, 3.3674f)
                curveTo(8.5286f, 3.422f, 8.3888f, 3.4799f, 8.2508f, 3.5412f)
                curveTo(7.8722f, 3.7093f, 7.4291f, 3.5386f, 7.261f, 3.16f)
                curveTo(7.0929f, 2.7814f, 7.2636f, 2.3383f, 7.6422f, 2.1702f)
                curveTo(7.8027f, 2.099f, 7.9653f, 2.0315f, 8.1298f, 1.968f)
                curveTo(8.5162f, 1.8188f, 8.9504f, 2.0112f, 9.0996f, 2.3976f)
                close()
                moveTo(5.6477f, 4.2403f)
                curveTo(5.9334f, 4.5403f, 5.9218f, 5.015f, 5.6218f, 5.3007f)
                curveTo(5.5122f, 5.4051f, 5.405f, 5.5122f, 5.3006f, 5.6219f)
                curveTo(5.0149f, 5.9218f, 4.5402f, 5.9334f, 4.2403f, 5.6478f)
                curveTo(3.9403f, 5.3621f, 3.9287f, 4.8874f, 4.2144f, 4.5874f)
                curveTo(4.3357f, 4.4601f, 4.46f, 4.3357f, 4.5874f, 4.2144f)
                curveTo(4.8873f, 3.9288f, 5.362f, 3.9404f, 5.6477f, 4.2403f)
                close()
                moveTo(3.16f, 7.2611f)
                curveTo(3.5386f, 7.4291f, 3.7092f, 7.8723f, 3.5411f, 8.2508f)
                curveTo(3.4799f, 8.3888f, 3.4219f, 8.5286f, 3.3673f, 8.67f)
                curveTo(3.2181f, 9.0565f, 2.784f, 9.2488f, 2.3975f, 9.0996f)
                curveTo(2.0111f, 8.9505f, 1.8188f, 8.5163f, 1.9679f, 8.1299f)
                curveTo(2.0315f, 7.9653f, 2.0989f, 7.8027f, 2.1702f, 7.6422f)
                curveTo(2.3382f, 7.2636f, 2.7814f, 7.093f, 3.16f, 7.2611f)
                close()
                moveTo(2.0211f, 11.0041f)
                curveTo(2.4352f, 11.0141f, 2.7628f, 11.3579f, 2.7527f, 11.772f)
                curveTo(2.7509f, 11.8478f, 2.75f, 11.9238f, 2.75f, 12.0001f)
                curveTo(2.75f, 12.0763f, 2.7509f, 12.1523f, 2.7527f, 12.2281f)
                curveTo(2.7628f, 12.6422f, 2.4352f, 12.986f, 2.0211f, 12.996f)
                curveTo(1.607f, 13.006f, 1.2632f, 12.6784f, 1.2532f, 12.2643f)
                curveTo(1.2511f, 12.1765f, 1.25f, 12.0884f, 1.25f, 12.0001f)
                curveTo(1.25f, 11.9117f, 1.2511f, 11.8236f, 1.2532f, 11.7358f)
                curveTo(1.2632f, 11.3217f, 1.607f, 10.9941f, 2.0211f, 11.0041f)
                close()
                moveTo(21.6025f, 14.9005f)
                curveTo(21.9889f, 15.0496f, 22.1812f, 15.4838f, 22.032f, 15.8702f)
                curveTo(21.9685f, 16.0348f, 21.9011f, 16.1974f, 21.8298f, 16.3579f)
                curveTo(21.6618f, 16.7365f, 21.2186f, 16.9071f, 20.84f, 16.7391f)
                curveTo(20.4614f, 16.571f, 20.2908f, 16.1278f, 20.4589f, 15.7493f)
                curveTo(20.5201f, 15.6113f, 20.5781f, 15.4715f, 20.6327f, 15.3301f)
                curveTo(20.7819f, 14.9436f, 21.216f, 14.7513f, 21.6025f, 14.9005f)
                close()
                moveTo(2.3975f, 14.9005f)
                curveTo(2.784f, 14.7513f, 3.2181f, 14.9436f, 3.3673f, 15.3301f)
                curveTo(3.4219f, 15.4715f, 3.4799f, 15.6113f, 3.5411f, 15.7493f)
                curveTo(3.7092f, 16.1278f, 3.5386f, 16.571f, 3.16f, 16.7391f)
                curveTo(2.7814f, 16.9071f, 2.3382f, 16.7365f, 2.1702f, 16.3579f)
                curveTo(2.0989f, 16.1974f, 2.0315f, 16.0348f, 1.9679f, 15.8702f)
                curveTo(1.8188f, 15.4838f, 2.0111f, 15.0496f, 2.3975f, 14.9005f)
                close()
                moveTo(19.7597f, 18.3523f)
                curveTo(20.0597f, 18.638f, 20.0713f, 19.1127f, 19.7856f, 19.4127f)
                curveTo(19.6643f, 19.54f, 19.54f, 19.6644f, 19.4126f, 19.7857f)
                curveTo(19.1127f, 20.0713f, 18.638f, 20.0597f, 18.3523f, 19.7598f)
                curveTo(18.0666f, 19.4598f, 18.0782f, 18.9851f, 18.3782f, 18.6994f)
                curveTo(18.4878f, 18.595f, 18.5949f, 18.4879f, 18.6994f, 18.3782f)
                curveTo(18.9851f, 18.0783f, 19.4598f, 18.0667f, 19.7597f, 18.3523f)
                close()
                moveTo(4.2403f, 18.3523f)
                curveTo(4.5402f, 18.0667f, 5.0149f, 18.0783f, 5.3006f, 18.3782f)
                curveTo(5.405f, 18.4879f, 5.5122f, 18.595f, 5.6218f, 18.6994f)
                curveTo(5.9218f, 18.9851f, 5.9334f, 19.4598f, 5.6477f, 19.7598f)
                curveTo(5.362f, 20.0597f, 4.8873f, 20.0713f, 4.5874f, 19.7857f)
                curveTo(4.46f, 19.6644f, 4.3357f, 19.54f, 4.2144f, 19.4127f)
                curveTo(3.9287f, 19.1127f, 3.9403f, 18.638f, 4.2403f, 18.3523f)
                close()
                moveTo(7.261f, 20.8401f)
                curveTo(7.4291f, 20.4615f, 7.8722f, 20.2908f, 8.2508f, 20.4589f)
                curveTo(8.3888f, 20.5202f, 8.5286f, 20.5781f, 8.67f, 20.6327f)
                curveTo(9.0564f, 20.7819f, 9.2487f, 21.2161f, 9.0996f, 21.6025f)
                curveTo(8.9504f, 21.9889f, 8.5162f, 22.1813f, 8.1298f, 22.0321f)
                curveTo(7.9653f, 21.9686f, 7.8027f, 21.9011f, 7.6422f, 21.8299f)
                curveTo(7.2636f, 21.6618f, 7.0929f, 21.2187f, 7.261f, 20.8401f)
                close()
                moveTo(16.739f, 20.8401f)
                curveTo(16.9071f, 21.2187f, 16.7364f, 21.6618f, 16.3578f, 21.8299f)
                curveTo(16.1973f, 21.9011f, 16.0347f, 21.9686f, 15.8702f, 22.0321f)
                curveTo(15.4838f, 22.1813f, 15.0496f, 21.9889f, 14.9004f, 21.6025f)
                curveTo(14.7513f, 21.2161f, 14.9436f, 20.7819f, 15.33f, 20.6327f)
                curveTo(15.4714f, 20.5781f, 15.6112f, 20.5202f, 15.7492f, 20.4589f)
                curveTo(16.1278f, 20.2908f, 16.5709f, 20.4615f, 16.739f, 20.8401f)
                close()
                moveTo(11.004f, 21.979f)
                curveTo(11.0141f, 21.5649f, 11.3579f, 21.2373f, 11.7719f, 21.2473f)
                curveTo(11.8477f, 21.2491f, 11.9237f, 21.2501f, 12.0f, 21.2501f)
                curveTo(12.0763f, 21.2501f, 12.1523f, 21.2491f, 12.2281f, 21.2473f)
                curveTo(12.6421f, 21.2373f, 12.9859f, 21.5649f, 12.996f, 21.979f)
                curveTo(13.006f, 22.3931f, 12.6784f, 22.7369f, 12.2643f, 22.7469f)
                curveTo(12.1764f, 22.749f, 12.0883f, 22.7501f, 12.0f, 22.7501f)
                curveTo(11.9117f, 22.7501f, 11.8236f, 22.749f, 11.7357f, 22.7469f)
                curveTo(11.3216f, 22.7369f, 10.994f, 22.3931f, 11.004f, 21.979f)
                close()
            }
        }
            .build()
        return _history3!!
    }

private var _history3: ImageVector? = null
