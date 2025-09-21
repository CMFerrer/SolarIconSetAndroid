package dev.chiksmedina.solar.broken.homefurniture

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
import dev.chiksmedina.solar.broken.HomeFurnitureGroup

val HomeFurnitureGroup.Armchair2: ImageVector
    get() {
        if (_armchair2 != null) {
            return _armchair2!!
        }
        _armchair2 = Builder(
            name = "Armchair2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.2623f, 13.6f)
                lineTo(18.263f, 11.1339f)
                curveTo(18.5392f, 10.4533f, 19.2628f, 10.0f, 20.0731f, 10.0f)
                curveTo(21.3873f, 10.0f, 22.3153f, 11.1504f, 21.8997f, 12.2643f)
                lineTo(20.7803f, 15.2649f)
                curveTo(20.5852f, 15.7879f, 20.4876f, 16.0494f, 20.3588f, 16.2717f)
                curveTo(19.8348f, 17.1756f, 18.8608f, 17.8028f, 17.7354f, 17.9611f)
                curveTo(17.4587f, 18.0f, 17.1502f, 18.0f, 16.5332f, 18.0f)
                horizontalLineTo(16.0f)
                horizontalLineTo(6.8863f)
                curveTo(6.8244f, 18.0f, 6.7934f, 18.0f, 6.7653f, 17.9996f)
                curveTo(5.2652f, 17.9786f, 3.9387f, 17.1243f, 3.442f, 15.8594f)
                curveTo(3.4327f, 15.8357f, 3.4229f, 15.8095f, 3.4033f, 15.757f)
                lineTo(3.4033f, 15.757f)
                lineTo(2.1003f, 12.2643f)
                curveTo(1.6847f, 11.1504f, 2.6127f, 10.0f, 3.9269f, 10.0f)
                curveTo(4.7372f, 10.0f, 5.4608f, 10.4533f, 5.737f, 11.1339f)
                lineTo(6.8351f, 13.84f)
                lineTo(6.8351f, 13.84f)
                curveTo(6.9351f, 14.0863f, 6.985f, 14.2094f, 7.0574f, 14.3101f)
                curveTo(7.2266f, 14.5452f, 7.4922f, 14.7116f, 7.7972f, 14.7735f)
                curveTo(7.9278f, 14.8f, 8.0744f, 14.8f, 8.3676f, 14.8f)
                horizontalLineTo(15.3467f)
                curveTo(15.9158f, 14.8f, 16.2004f, 14.8f, 16.4383f, 14.7019f)
                curveTo(16.5683f, 14.6484f, 16.6864f, 14.5744f, 16.787f, 14.4835f)
                curveTo(16.9713f, 14.317f, 17.0683f, 14.078f, 17.2623f, 13.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.2971f, 4.6695f)
                lineTo(16.7798f, 5.2126f)
                lineTo(16.7798f, 5.2126f)
                lineTo(17.2971f, 4.6695f)
                close()
                moveTo(6.7029f, 4.6695f)
                lineTo(6.1857f, 4.1264f)
                lineTo(6.7029f, 4.6695f)
                close()
                moveTo(12.0f, 3.25f)
                curveTo(11.5858f, 3.25f, 11.25f, 3.5858f, 11.25f, 4.0f)
                curveTo(11.25f, 4.4142f, 11.5858f, 4.75f, 12.0f, 4.75f)
                verticalLineTo(3.25f)
                close()
                moveTo(8.1181f, 4.8482f)
                curveTo(8.5272f, 4.7829f, 8.8059f, 4.3985f, 8.7406f, 3.9894f)
                curveTo(8.6754f, 3.5804f, 8.2909f, 3.3017f, 7.8819f, 3.3669f)
                lineTo(8.1181f, 4.8482f)
                close()
                moveTo(6.75f, 12.0f)
                verticalLineTo(8.5714f)
                horizontalLineTo(5.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(17.25f, 8.5714f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.75f)
                verticalLineTo(8.5714f)
                horizontalLineTo(17.25f)
                close()
                moveTo(13.2f, 4.75f)
                curveTo(14.3516f, 4.75f, 15.1434f, 4.7515f, 15.7382f, 4.8276f)
                curveTo(16.315f, 4.9015f, 16.5921f, 5.0338f, 16.7798f, 5.2126f)
                lineTo(17.8143f, 4.1264f)
                curveTo(17.2991f, 3.6357f, 16.659f, 3.4333f, 15.9287f, 3.3398f)
                curveTo(15.2164f, 3.2485f, 14.3112f, 3.25f, 13.2f, 3.25f)
                verticalLineTo(4.75f)
                close()
                moveTo(18.75f, 8.5714f)
                curveTo(18.75f, 7.5162f, 18.7518f, 6.6455f, 18.6548f, 5.9585f)
                curveTo(18.5542f, 5.246f, 18.3347f, 4.622f, 17.8143f, 4.1264f)
                lineTo(16.7798f, 5.2126f)
                curveTo(16.9624f, 5.3865f, 17.0943f, 5.6358f, 17.1695f, 6.1682f)
                curveTo(17.2482f, 6.7261f, 17.25f, 7.4717f, 17.25f, 8.5714f)
                horizontalLineTo(18.75f)
                close()
                moveTo(6.75f, 8.5714f)
                curveTo(6.75f, 7.4717f, 6.7517f, 6.7261f, 6.8305f, 6.1682f)
                curveTo(6.9057f, 5.6358f, 7.0376f, 5.3865f, 7.2202f, 5.2126f)
                lineTo(6.1857f, 4.1264f)
                curveTo(5.6653f, 4.622f, 5.4458f, 5.246f, 5.3452f, 5.9585f)
                curveTo(5.2483f, 6.6455f, 5.25f, 7.5162f, 5.25f, 8.5714f)
                horizontalLineTo(6.75f)
                close()
                moveTo(12.0f, 4.75f)
                horizontalLineTo(13.2f)
                verticalLineTo(3.25f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.75f)
                close()
                moveTo(7.8819f, 3.3669f)
                curveTo(7.2294f, 3.4709f, 6.6554f, 3.679f, 6.1857f, 4.1264f)
                lineTo(7.2202f, 5.2126f)
                curveTo(7.3921f, 5.0488f, 7.6383f, 4.9247f, 8.1181f, 4.8482f)
                lineTo(7.8819f, 3.3669f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 20.0f)
                verticalLineTo(18.0f)
                moveTo(6.0f, 20.0f)
                verticalLineTo(18.6667f)
            }
        }
            .build()
        return _armchair2!!
    }

private var _armchair2: ImageVector? = null
