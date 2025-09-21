package dev.chiksmedina.solar.outline.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.TimeGroup

val TimeGroup.AlarmPlay: ImageVector
    get() {
        if (_alarmPlay != null) {
            return _alarmPlay!!
        }
        _alarmPlay = Builder(
            name = "AlarmPlay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.136f, 1.6026f)
                curveTo(8.3556f, 1.9539f, 8.2488f, 2.4166f, 7.8975f, 2.6361f)
                lineTo(3.8975f, 5.1361f)
                curveTo(3.5462f, 5.3556f, 3.0835f, 5.2488f, 2.864f, 4.8976f)
                curveTo(2.6445f, 4.5463f, 2.7513f, 4.0836f, 3.1025f, 3.8641f)
                lineTo(7.1025f, 1.3641f)
                curveTo(7.4538f, 1.1446f, 7.9165f, 1.2514f, 8.136f, 1.6026f)
                close()
                moveTo(15.864f, 1.6026f)
                curveTo(16.0835f, 1.2514f, 16.5462f, 1.1446f, 16.8975f, 1.3641f)
                lineTo(20.8975f, 3.8641f)
                curveTo(21.2488f, 4.0836f, 21.3555f, 4.5464f, 21.136f, 4.8976f)
                curveTo(20.9165f, 5.2488f, 20.4538f, 5.3556f, 20.1025f, 5.1361f)
                lineTo(16.1025f, 2.6361f)
                curveTo(15.7512f, 2.4166f, 15.6445f, 1.9539f, 15.864f, 1.6026f)
                close()
                moveTo(12.0f, 4.7501f)
                curveTo(7.4436f, 4.7501f, 3.75f, 8.4438f, 3.75f, 13.0001f)
                curveTo(3.75f, 17.5564f, 7.4436f, 21.2501f, 12.0f, 21.2501f)
                curveTo(16.5563f, 21.2501f, 20.25f, 17.5564f, 20.25f, 13.0001f)
                curveTo(20.25f, 8.4438f, 16.5563f, 4.7501f, 12.0f, 4.7501f)
                close()
                moveTo(2.25f, 13.0001f)
                curveTo(2.25f, 7.6153f, 6.6152f, 3.2501f, 12.0f, 3.2501f)
                curveTo(17.3848f, 3.2501f, 21.75f, 7.6153f, 21.75f, 13.0001f)
                curveTo(21.75f, 18.3849f, 17.3848f, 22.7501f, 12.0f, 22.7501f)
                curveTo(6.6152f, 22.7501f, 2.25f, 18.3849f, 2.25f, 13.0001f)
                close()
                moveTo(12.5727f, 9.0903f)
                curveTo(12.5923f, 9.1022f, 12.6119f, 9.1141f, 12.6316f, 9.1261f)
                curveTo(12.9188f, 9.3007f, 13.2022f, 9.4823f, 13.4571f, 9.6612f)
                curveTo(13.7473f, 9.865f, 14.0567f, 10.105f, 14.3617f, 10.3537f)
                curveTo(14.3771f, 10.3663f, 14.3925f, 10.3788f, 14.4078f, 10.3913f)
                curveTo(14.9056f, 10.7974f, 15.3532f, 11.1624f, 15.6659f, 11.5265f)
                curveTo(16.0204f, 11.9394f, 16.25f, 12.4035f, 16.25f, 13.0001f)
                curveTo(16.25f, 13.5967f, 16.0204f, 14.0608f, 15.6659f, 14.4737f)
                curveTo(15.3532f, 14.8378f, 14.9057f, 15.2028f, 14.4078f, 15.6089f)
                lineTo(14.3617f, 15.6465f)
                curveTo(14.0567f, 15.8952f, 13.7473f, 16.1352f, 13.4571f, 16.339f)
                curveTo(13.2022f, 16.5179f, 12.9188f, 16.6995f, 12.6316f, 16.8741f)
                curveTo(12.6119f, 16.8861f, 12.5923f, 16.898f, 12.5727f, 16.9099f)
                curveTo(12.0879f, 17.205f, 11.6298f, 17.4837f, 11.2289f, 17.6277f)
                curveTo(11.0061f, 17.7077f, 10.7505f, 17.7665f, 10.4754f, 17.746f)
                curveTo(10.1864f, 17.7245f, 9.9277f, 17.6196f, 9.7022f, 17.4503f)
                curveTo(9.2431f, 17.1057f, 9.0587f, 16.6067f, 8.9625f, 16.1105f)
                curveTo(8.8709f, 15.6377f, 8.8357f, 15.0288f, 8.7946f, 14.3172f)
                lineTo(8.7916f, 14.2656f)
                curveTo(8.7664f, 13.8294f, 8.75f, 13.395f, 8.75f, 13.0001f)
                curveTo(8.75f, 12.6052f, 8.7664f, 12.1708f, 8.7916f, 11.7346f)
                lineTo(8.7946f, 11.683f)
                curveTo(8.8357f, 10.9714f, 8.8709f, 10.3625f, 8.9625f, 9.8897f)
                curveTo(9.0587f, 9.3935f, 9.2431f, 8.8945f, 9.7022f, 8.5499f)
                curveTo(9.9277f, 8.3806f, 10.1864f, 8.2757f, 10.4754f, 8.2542f)
                curveTo(10.7505f, 8.2337f, 11.0061f, 8.2925f, 11.2289f, 8.3725f)
                curveTo(11.6298f, 8.5165f, 12.0879f, 8.7952f, 12.5727f, 9.0903f)
                close()
                moveTo(10.6004f, 9.7512f)
                curveTo(10.5758f, 9.7701f, 10.5007f, 9.8366f, 10.4351f, 10.1751f)
                curveTo(10.365f, 10.5369f, 10.3341f, 11.0436f, 10.2891f, 11.8213f)
                curveTo(10.2649f, 12.24f, 10.25f, 12.6437f, 10.25f, 13.0001f)
                curveTo(10.25f, 13.3565f, 10.2649f, 13.7602f, 10.2891f, 14.1789f)
                curveTo(10.3341f, 14.9566f, 10.365f, 15.4633f, 10.4351f, 15.8251f)
                curveTo(10.5007f, 16.1636f, 10.5758f, 16.2302f, 10.6004f, 16.249f)
                curveTo(10.6192f, 16.2466f, 10.6575f, 16.2391f, 10.7218f, 16.216f)
                curveTo(10.9612f, 16.13f, 11.2865f, 15.9365f, 11.8523f, 15.5925f)
                curveTo(12.1215f, 15.4288f, 12.3755f, 15.2656f, 12.5951f, 15.1114f)
                curveTo(12.8458f, 14.9354f, 13.125f, 14.7195f, 13.4135f, 14.4841f)
                curveTo(13.9722f, 14.0284f, 14.3127f, 13.7471f, 14.5279f, 13.4965f)
                curveTo(14.7108f, 13.2834f, 14.75f, 13.1533f, 14.75f, 13.0001f)
                curveTo(14.75f, 12.8469f, 14.7108f, 12.7168f, 14.5279f, 12.5037f)
                curveTo(14.3127f, 12.2531f, 13.9722f, 11.9718f, 13.4135f, 11.5161f)
                curveTo(13.125f, 11.2807f, 12.8458f, 11.0648f, 12.5951f, 10.8888f)
                curveTo(12.3755f, 10.7346f, 12.1215f, 10.5714f, 11.8523f, 10.4077f)
                curveTo(11.2865f, 10.0637f, 10.9612f, 9.8702f, 10.7218f, 9.7842f)
                curveTo(10.6575f, 9.7611f, 10.6192f, 9.7536f, 10.6004f, 9.7512f)
                close()
            }
        }
            .build()
        return _alarmPlay!!
    }

private var _alarmPlay: ImageVector? = null
