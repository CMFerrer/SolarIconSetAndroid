package dev.chiksmedina.solar.bold.naturetravel

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
import dev.chiksmedina.solar.bold.NatureTravelGroup

val NatureTravelGroup.SuitcaseLines: ImageVector
    get() {
        if (_suitcaseLines != null) {
            return _suitcaseLines!!
        }
        _suitcaseLines = Builder(
            name = "SuitcaseLines", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.052f, 1.25f)
                horizontalLineTo(11.948f)
                curveTo(11.0495f, 1.25f, 10.3003f, 1.25f, 9.7055f, 1.3299f)
                curveTo(9.0777f, 1.4143f, 8.5109f, 1.6f, 8.0555f, 2.0555f)
                curveTo(7.6f, 2.5109f, 7.4143f, 3.0777f, 7.3299f, 3.7055f)
                curveTo(7.2499f, 4.3003f, 7.25f, 5.0495f, 7.25f, 5.948f)
                verticalLineTo(6.0257f)
                curveTo(5.2288f, 6.0918f, 4.0151f, 6.328f, 3.1716f, 7.1716f)
                curveTo(2.4774f, 7.8658f, 2.1945f, 8.8107f, 2.0793f, 10.25f)
                horizontalLineTo(21.9207f)
                curveTo(21.8055f, 8.8107f, 21.5226f, 7.8658f, 20.8284f, 7.1716f)
                curveTo(19.9849f, 6.328f, 18.7712f, 6.0918f, 16.75f, 6.0257f)
                verticalLineTo(5.948f)
                curveTo(16.75f, 5.0495f, 16.7501f, 4.3003f, 16.6701f, 3.7055f)
                curveTo(16.5857f, 3.0777f, 16.4f, 2.5109f, 15.9445f, 2.0555f)
                curveTo(15.4891f, 1.6f, 14.9223f, 1.4143f, 14.2945f, 1.3299f)
                curveTo(13.6997f, 1.25f, 12.9505f, 1.25f, 12.052f, 1.25f)
                close()
                moveTo(15.25f, 6.0019f)
                verticalLineTo(6.0f)
                curveTo(15.25f, 5.036f, 15.2484f, 4.3884f, 15.1835f, 3.9054f)
                curveTo(15.1214f, 3.4439f, 15.0142f, 3.2464f, 14.8839f, 3.1161f)
                curveTo(14.7536f, 2.9858f, 14.5561f, 2.8786f, 14.0946f, 2.8165f)
                curveTo(13.6116f, 2.7516f, 12.964f, 2.75f, 12.0f, 2.75f)
                curveTo(11.036f, 2.75f, 10.3884f, 2.7516f, 9.9054f, 2.8165f)
                curveTo(9.4439f, 2.8786f, 9.2464f, 2.9858f, 9.1161f, 3.1161f)
                curveTo(8.9858f, 3.2464f, 8.8786f, 3.4439f, 8.8165f, 3.9054f)
                curveTo(8.7516f, 4.3884f, 8.75f, 5.036f, 8.75f, 6.0f)
                verticalLineTo(6.0019f)
                curveTo(9.142f, 6.0f, 9.5581f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(14.4419f, 6.0f, 14.858f, 6.0f, 15.25f, 6.0019f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 13.161f, 2.0f, 12.4153f, 2.0129f, 11.75f)
                horizontalLineTo(21.9871f)
                curveTo(22.0f, 12.4153f, 22.0f, 13.161f, 22.0f, 14.0f)
                curveTo(22.0f, 14.839f, 22.0f, 15.5847f, 21.9871f, 16.25f)
                lineTo(2.0129f, 16.25f)
                curveTo(2.0f, 15.5847f, 2.0f, 14.839f, 2.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0793f, 17.75f)
                curveTo(2.1945f, 19.1893f, 2.4774f, 20.1342f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(21.5226f, 20.1342f, 21.8055f, 19.1893f, 21.9207f, 17.75f)
                horizontalLineTo(2.0793f)
                close()
            }
        }
            .build()
        return _suitcaseLines!!
    }

private var _suitcaseLines: ImageVector? = null
