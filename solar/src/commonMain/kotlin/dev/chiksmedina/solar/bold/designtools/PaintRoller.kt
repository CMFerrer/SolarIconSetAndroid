package dev.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) {
            return _paintRoller!!
        }
        _paintRoller = Builder(
            name = "PaintRoller", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.0f, 4.5f)
                curveTo(6.0f, 3.5654f, 6.0f, 3.0981f, 6.201f, 2.75f)
                curveTo(6.3326f, 2.522f, 6.522f, 2.3326f, 6.75f, 2.201f)
                curveTo(7.0981f, 2.0f, 7.5654f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(15.5f)
                curveTo(16.4346f, 2.0f, 16.9019f, 2.0f, 17.25f, 2.201f)
                curveTo(17.478f, 2.3326f, 17.6674f, 2.522f, 17.799f, 2.75f)
                curveTo(18.0f, 3.0981f, 18.0f, 3.5654f, 18.0f, 4.5f)
                curveTo(18.0f, 5.4346f, 18.0f, 5.9019f, 17.799f, 6.25f)
                curveTo(17.6674f, 6.478f, 17.478f, 6.6674f, 17.25f, 6.799f)
                curveTo(16.9019f, 7.0f, 16.4346f, 7.0f, 15.5f, 7.0f)
                horizontalLineTo(8.5f)
                curveTo(7.5654f, 7.0f, 7.0981f, 7.0f, 6.75f, 6.799f)
                curveTo(6.522f, 6.6674f, 6.3326f, 6.478f, 6.201f, 6.25f)
                curveTo(6.0f, 5.9019f, 6.0f, 5.4346f, 6.0f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0021f, 3.939f)
                curveTo(4.8475f, 4.0764f, 4.75f, 4.2767f, 4.75f, 4.4999f)
                curveTo(4.75f, 4.7231f, 4.8475f, 4.9234f, 5.0021f, 5.0608f)
                curveTo(5.0f, 4.8961f, 5.0f, 4.7219f, 5.0f, 4.5401f)
                verticalLineTo(4.4597f)
                curveTo(5.0f, 4.2779f, 5.0f, 4.1037f, 5.0021f, 3.939f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(10.0f, 20.9428f, 10.0f, 21.4142f, 10.2929f, 21.7071f)
                curveTo(10.5858f, 22.0f, 11.0572f, 22.0f, 12.0f, 22.0f)
                curveTo(12.9428f, 22.0f, 13.4142f, 22.0f, 13.7071f, 21.7071f)
                curveTo(14.0f, 21.4142f, 14.0f, 20.9428f, 14.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(14.0f, 15.0572f, 14.0f, 14.5858f, 13.7071f, 14.2929f)
                curveTo(13.4142f, 14.0f, 12.9428f, 14.0f, 12.0f, 14.0f)
                curveTo(11.0572f, 14.0f, 10.5858f, 14.0f, 10.2929f, 14.2929f)
                curveTo(10.0f, 14.5858f, 10.0f, 15.0572f, 10.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.9941f, 5.25f)
                horizontalLineTo(19.045f)
                curveTo(19.4997f, 5.25f, 19.8048f, 5.2504f, 20.0413f, 5.2658f)
                curveTo(20.2715f, 5.2808f, 20.384f, 5.3078f, 20.458f, 5.3369f)
                curveTo(20.7807f, 5.464f, 21.0362f, 5.7194f, 21.1632f, 6.0421f)
                curveTo(21.1924f, 6.1161f, 21.2193f, 6.2286f, 21.2343f, 6.4588f)
                curveTo(21.2497f, 6.6953f, 21.2501f, 7.0004f, 21.2501f, 7.4551f)
                curveTo(21.2501f, 8.2924f, 21.2395f, 8.5218f, 21.1788f, 8.6939f)
                curveTo(21.0745f, 8.9892f, 20.8632f, 9.2346f, 20.5866f, 9.3815f)
                curveTo(20.4255f, 9.4671f, 20.2002f, 9.5116f, 19.3721f, 9.6358f)
                lineTo(15.2487f, 10.2543f)
                curveTo(14.4761f, 10.3702f, 13.8275f, 10.4675f, 13.315f, 10.6116f)
                curveTo(12.7719f, 10.7643f, 12.2914f, 10.9923f, 11.9163f, 11.4278f)
                curveTo(11.5332f, 11.8727f, 11.375f, 12.4055f, 11.3069f, 13.0062f)
                curveTo(11.5111f, 12.9999f, 11.7267f, 13.0f, 11.9455f, 13.0f)
                horizontalLineTo(12.0544f)
                curveTo(12.3193f, 13.0f, 12.5796f, 12.9999f, 12.8206f, 13.011f)
                curveTo(12.8706f, 12.6902f, 12.9479f, 12.5286f, 13.0529f, 12.4067f)
                curveTo(13.1624f, 12.2796f, 13.3304f, 12.1654f, 13.721f, 12.0556f)
                curveTo(14.1319f, 11.94f, 14.6862f, 11.8555f, 15.518f, 11.7307f)
                lineTo(19.7138f, 11.1014f)
                curveTo(20.3645f, 11.0044f, 20.8714f, 10.9288f, 21.2905f, 10.7061f)
                curveTo(21.8988f, 10.3829f, 22.3637f, 9.843f, 22.5931f, 9.1935f)
                curveTo(22.7512f, 8.746f, 22.7507f, 8.2335f, 22.7502f, 7.5756f)
                lineTo(22.7501f, 7.431f)
                curveTo(22.7501f, 7.0066f, 22.7501f, 6.6523f, 22.7311f, 6.3612f)
                curveTo(22.7114f, 6.0582f, 22.6688f, 5.7717f, 22.5589f, 5.4926f)
                curveTo(22.2794f, 4.7826f, 21.7175f, 4.2207f, 21.0075f, 3.9412f)
                curveTo(20.7284f, 3.8313f, 20.4419f, 3.7887f, 20.1389f, 3.769f)
                curveTo(19.8478f, 3.75f, 19.4935f, 3.75f, 19.0691f, 3.75f)
                horizontalLineTo(18.9941f)
                curveTo(19.0f, 3.9687f, 19.0f, 4.2068f, 18.9999f, 4.4598f)
                verticalLineTo(4.5402f)
                curveTo(19.0f, 4.7932f, 19.0f, 5.0313f, 18.9941f, 5.25f)
                close()
            }
        }
            .build()
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
