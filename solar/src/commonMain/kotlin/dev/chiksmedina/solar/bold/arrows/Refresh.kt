package dev.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(
            name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0789f, 2.25f)
                curveTo(7.2854f, 2.25f, 3.3448f, 5.913f, 2.9606f, 10.5833f)
                horizontalLineTo(2.0f)
                curveTo(1.6961f, 10.5833f, 1.4223f, 10.7667f, 1.3066f, 11.0477f)
                curveTo(1.1908f, 11.3287f, 1.2561f, 11.6517f, 1.4718f, 11.8657f)
                lineTo(3.1516f, 13.5324f)
                curveTo(3.444f, 13.8225f, 3.9157f, 13.8225f, 4.2081f, 13.5324f)
                lineTo(5.8879f, 11.8657f)
                curveTo(6.1036f, 11.6517f, 6.1689f, 11.3287f, 6.0531f, 11.0477f)
                curveTo(5.9374f, 10.7667f, 5.6635f, 10.5833f, 5.3597f, 10.5833f)
                horizontalLineTo(4.4668f)
                curveTo(4.8465f, 6.7517f, 8.1048f, 3.75f, 12.0789f, 3.75f)
                curveTo(14.8484f, 3.75f, 17.2727f, 5.2084f, 18.6156f, 7.3928f)
                curveTo(18.8325f, 7.7456f, 19.2944f, 7.8559f, 19.6473f, 7.6389f)
                curveTo(20.0002f, 7.422f, 20.1104f, 6.9601f, 19.8934f, 6.6072f)
                curveTo(18.2871f, 3.9943f, 15.3873f, 2.25f, 12.0789f, 2.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.8411f, 10.4666f)
                curveTo(20.549f, 10.1778f, 20.0789f, 10.1778f, 19.7867f, 10.4666f)
                lineTo(18.1005f, 12.1333f)
                curveTo(17.8841f, 12.3471f, 17.8184f, 12.6703f, 17.9339f, 12.9517f)
                curveTo(18.0495f, 13.233f, 18.3235f, 13.4167f, 18.6277f, 13.4167f)
                horizontalLineTo(19.5268f)
                curveTo(19.1455f, 17.2462f, 15.8759f, 20.25f, 11.8828f, 20.25f)
                curveTo(9.1003f, 20.25f, 6.6659f, 18.7903f, 5.318f, 16.6061f)
                curveTo(5.1004f, 16.2536f, 4.6383f, 16.1442f, 4.2858f, 16.3618f)
                curveTo(3.9333f, 16.5793f, 3.8239f, 17.0414f, 4.0415f, 17.3939f)
                curveTo(5.6541f, 20.007f, 8.5641f, 21.75f, 11.8828f, 21.75f)
                curveTo(16.6906f, 21.75f, 20.6475f, 18.0892f, 21.0331f, 13.4167f)
                horizontalLineTo(22.0002f)
                curveTo(22.3043f, 13.4167f, 22.5783f, 13.233f, 22.6939f, 12.9517f)
                curveTo(22.8095f, 12.6703f, 22.7437f, 12.3471f, 22.5274f, 12.1333f)
                lineTo(20.8411f, 10.4666f)
                close()
            }
        }
            .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
