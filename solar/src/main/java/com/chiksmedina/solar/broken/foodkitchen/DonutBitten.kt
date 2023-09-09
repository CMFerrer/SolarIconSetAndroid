package com.chiksmedina.solar.broken.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.FoodKitchenGroup

public val FoodKitchenGroup.DonutBitten: ImageVector
    get() {
        if (_donutBitten != null) {
            return _donutBitten!!
        }
        _donutBitten = Builder(name = "DonutBitten", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 7.0f)
                lineTo(16.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 7.0f)
                lineTo(20.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                lineTo(11.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 7.0f)
                lineTo(9.134f, 7.366f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                lineTo(6.0f, 4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7924f, 9.1439f)
                lineTo(6.2072f, 7.8564f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 22.0f)
                lineTo(12.5343f, 22.7492f)
                curveTo(12.811f, 22.7365f, 13.0582f, 22.5724f, 13.1772f, 22.3222f)
                curveTo(13.2963f, 22.0721f, 13.2677f, 21.7768f, 13.103f, 21.554f)
                lineTo(12.5f, 22.0f)
                close()
                moveTo(12.944f, 19.6276f)
                lineTo(13.3899f, 20.2306f)
                lineTo(12.944f, 19.6276f)
                close()
                moveTo(19.4787f, 14.7949f)
                lineTo(19.0327f, 14.1919f)
                lineTo(19.0327f, 14.1919f)
                lineTo(19.4787f, 14.7949f)
                close()
                moveTo(14.6191f, 18.8552f)
                lineTo(15.2221f, 18.4092f)
                lineTo(15.2221f, 18.4092f)
                lineTo(14.6191f, 18.8552f)
                close()
                moveTo(15.3194f, 16.0052f)
                lineTo(15.7654f, 16.6083f)
                lineTo(15.3194f, 16.0052f)
                close()
                moveTo(18.2495f, 16.1704f)
                lineTo(18.8525f, 15.7244f)
                lineTo(18.8525f, 15.7244f)
                lineTo(18.2495f, 16.1704f)
                close()
                moveTo(21.6265f, 14.7168f)
                lineTo(21.14f, 15.2876f)
                curveTo(21.3346f, 15.4534f, 21.6002f, 15.5087f, 21.8447f, 15.4343f)
                curveTo(22.0893f, 15.36f, 22.2791f, 15.1662f, 22.3485f, 14.9201f)
                lineTo(21.6265f, 14.7168f)
                close()
                moveTo(18.584f, 16.6226f)
                lineTo(17.9809f, 17.0686f)
                curveTo(18.1107f, 17.2441f, 18.3106f, 17.3544f, 18.5283f, 17.3706f)
                curveTo(18.746f, 17.3868f, 18.9599f, 17.3073f, 19.1143f, 17.153f)
                lineTo(18.584f, 16.6226f)
                close()
                moveTo(18.6854f, 16.5212f)
                lineTo(19.2157f, 17.0515f)
                curveTo(19.3871f, 16.8801f, 19.4651f, 16.6365f, 19.4251f, 16.3974f)
                lineTo(18.6854f, 16.5212f)
                close()
                moveTo(14.6191f, 19.291f)
                lineTo(14.3938f, 20.0064f)
                curveTo(14.6605f, 20.0904f, 14.9517f, 20.019f, 15.1494f, 19.8213f)
                lineTo(14.6191f, 19.291f)
                close()
                moveTo(14.8044f, 19.1057f)
                lineTo(15.3347f, 19.6361f)
                curveTo(15.5973f, 19.3735f, 15.6282f, 18.9583f, 15.4074f, 18.6598f)
                lineTo(14.8044f, 19.1057f)
                close()
                moveTo(3.021f, 17.913f)
                curveTo(3.2491f, 18.2588f, 3.7143f, 18.3541f, 4.0601f, 18.126f)
                curveTo(4.4058f, 17.8979f, 4.5012f, 17.4327f, 4.273f, 17.087f)
                lineTo(3.021f, 17.913f)
                close()
                moveTo(7.9636f, 20.3254f)
                curveTo(7.591f, 20.1444f, 7.1423f, 20.2997f, 6.9613f, 20.6723f)
                curveTo(6.7803f, 21.0448f, 6.9356f, 21.4936f, 7.3081f, 21.6746f)
                lineTo(7.9636f, 20.3254f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                verticalLineTo(1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(13.103f, 21.554f)
                curveTo(12.8699f, 21.2389f, 12.9028f, 20.5909f, 13.3899f, 20.2306f)
                lineTo(12.498f, 19.0246f)
                curveTo(11.3811f, 19.8506f, 11.1449f, 21.429f, 11.897f, 22.446f)
                lineTo(13.103f, 21.554f)
                close()
                moveTo(15.2221f, 18.4092f)
                curveTo(14.9266f, 18.0097f, 14.9862f, 17.1845f, 15.7654f, 16.6083f)
                lineTo(14.8735f, 15.4022f)
                curveTo(13.6476f, 16.3088f, 13.0801f, 18.0355f, 14.0161f, 19.3011f)
                lineTo(15.2221f, 18.4092f)
                close()
                moveTo(15.7654f, 16.6083f)
                curveTo(16.5445f, 16.0321f, 17.351f, 16.2168f, 17.6465f, 16.6163f)
                lineTo(18.8525f, 15.7244f)
                curveTo(17.9165f, 14.4588f, 16.0993f, 14.4957f, 14.8735f, 15.4022f)
                lineTo(15.7654f, 16.6083f)
                close()
                moveTo(19.9246f, 15.398f)
                curveTo(20.4213f, 15.0306f, 20.9259f, 15.105f, 21.14f, 15.2876f)
                lineTo(22.1131f, 14.146f)
                curveTo(21.2462f, 13.4071f, 19.9508f, 13.5129f, 19.0327f, 14.1919f)
                lineTo(19.9246f, 15.398f)
                close()
                moveTo(21.25f, 12.0f)
                curveTo(21.25f, 12.8723f, 21.1295f, 13.7151f, 20.9046f, 14.5135f)
                lineTo(22.3485f, 14.9201f)
                curveTo(22.6102f, 13.9907f, 22.75f, 13.0111f, 22.75f, 12.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(12.4657f, 21.2508f)
                curveTo(12.332f, 21.2569f, 12.2017f, 21.25f, 12.0f, 21.25f)
                verticalLineTo(22.75f)
                curveTo(12.1103f, 22.75f, 12.3595f, 22.7572f, 12.5343f, 22.7492f)
                lineTo(12.4657f, 21.2508f)
                close()
                moveTo(17.6465f, 16.6163f)
                lineTo(17.9809f, 17.0686f)
                lineTo(19.187f, 16.1767f)
                lineTo(18.8525f, 15.7244f)
                lineTo(17.6465f, 16.6163f)
                close()
                moveTo(19.4251f, 16.3974f)
                curveTo(19.3792f, 16.1229f, 19.5124f, 15.7028f, 19.9246f, 15.398f)
                lineTo(19.0327f, 14.1919f)
                curveTo(18.2419f, 14.7768f, 17.7921f, 15.7276f, 17.9457f, 16.645f)
                lineTo(19.4251f, 16.3974f)
                close()
                moveTo(19.1143f, 17.153f)
                lineTo(19.2157f, 17.0515f)
                lineTo(18.1551f, 15.9909f)
                lineTo(18.0536f, 16.0923f)
                lineTo(19.1143f, 17.153f)
                close()
                moveTo(13.3899f, 20.2306f)
                curveTo(13.747f, 19.9665f, 14.1352f, 19.9249f, 14.3938f, 20.0064f)
                lineTo(14.8444f, 18.5756f)
                curveTo(14.0774f, 18.3341f, 13.1961f, 18.5083f, 12.498f, 19.0246f)
                lineTo(13.3899f, 20.2306f)
                close()
                moveTo(14.0161f, 19.3011f)
                lineTo(14.2014f, 19.5517f)
                lineTo(15.4074f, 18.6598f)
                lineTo(15.2221f, 18.4092f)
                lineTo(14.0161f, 19.3011f)
                close()
                moveTo(15.1494f, 19.8213f)
                lineTo(15.3347f, 19.6361f)
                lineTo(14.274f, 18.5754f)
                lineTo(14.0888f, 18.7607f)
                lineTo(15.1494f, 19.8213f)
                close()
                moveTo(4.273f, 17.087f)
                curveTo(3.3104f, 15.6279f, 2.75f, 13.8805f, 2.75f, 12.0f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 14.1831f, 1.9016f, 16.2163f, 3.021f, 17.913f)
                lineTo(4.273f, 17.087f)
                close()
                moveTo(12.0f, 21.25f)
                curveTo(10.5513f, 21.25f, 9.1825f, 20.9175f, 7.9636f, 20.3254f)
                lineTo(7.3081f, 21.6746f)
                curveTo(8.7268f, 22.3638f, 10.3194f, 22.75f, 12.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.0f)
                curveTo(2.0f, 13.0f, 4.2009f, 15.0f, 6.0f, 15.0f)
                curveTo(7.212f, 15.0f, 8.6063f, 14.0924f, 9.3872f, 13.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 15.5f)
                curveTo(15.5f, 15.0f, 14.4713f, 14.6389f, 14.0f, 14.2236f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.6497f, 8.9766f)
                lineTo(16.7161f, 10.3893f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.6777f, 10.085f)
                lineTo(18.9996f, 11.5629f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.6648f, 12.6412f)
                lineTo(6.5f, 11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6829f, 10.3498f)
                lineTo(3.6043f, 8.9378f)
            }
        }
        .build()
        return _donutBitten!!
    }

private var _donutBitten: ImageVector? = null
