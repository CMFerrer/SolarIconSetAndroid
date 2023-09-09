package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

public val DesignToolsGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(name = "Palette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 19.0f)
                curveTo(7.75f, 19.4142f, 7.4142f, 19.75f, 7.0f, 19.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 19.75f, 4.25f, 19.4142f, 4.25f, 19.0f)
                curveTo(4.25f, 18.5858f, 4.5858f, 18.25f, 5.0f, 18.25f)
                horizontalLineTo(7.0f)
                curveTo(7.4142f, 18.25f, 7.75f, 18.5858f, 7.75f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(10.0f, 4.5999f, 10.0f, 3.8998f, 9.7275f, 3.365f)
                curveTo(9.4878f, 2.8946f, 9.1054f, 2.5122f, 8.635f, 2.2725f)
                curveTo(8.1002f, 2.0f, 7.4001f, 2.0f, 6.0f, 2.0f)
                curveTo(4.5999f, 2.0f, 3.8998f, 2.0f, 3.365f, 2.2725f)
                curveTo(2.8946f, 2.5122f, 2.5122f, 2.8946f, 2.2725f, 3.365f)
                curveTo(2.0f, 3.8998f, 2.0f, 4.5999f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.4001f, 2.0f, 20.1002f, 2.2725f, 20.635f)
                curveTo(2.5122f, 21.1054f, 2.8946f, 21.4878f, 3.365f, 21.7275f)
                curveTo(3.8998f, 22.0f, 4.5999f, 22.0f, 6.0f, 22.0f)
                curveTo(7.4001f, 22.0f, 8.1002f, 22.0f, 8.635f, 21.7275f)
                curveTo(9.1054f, 21.4878f, 9.4878f, 21.1054f, 9.7275f, 20.635f)
                curveTo(10.0f, 20.1002f, 10.0f, 19.4001f, 10.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.2428f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 18.9186f, 10.0f, 19.5359f, 9.923f, 20.0029f)
                lineTo(13.2219f, 16.7041f)
                lineTo(19.0599f, 10.6145f)
                curveTo(20.0332f, 9.6111f, 20.5199f, 9.1094f, 20.6964f, 8.5343f)
                curveTo(20.847f, 8.0437f, 20.843f, 7.5188f, 20.685f, 7.0307f)
                curveTo(20.4997f, 6.4583f, 19.9999f, 5.9585f, 19.0003f, 4.9589f)
                curveTo(18.0991f, 4.0726f, 17.6484f, 3.6294f, 17.1204f, 3.4446f)
                curveTo(16.6857f, 3.2924f, 16.2175f, 3.2633f, 15.7673f, 3.3604f)
                curveTo(15.2204f, 3.4783f, 14.7183f, 3.8622f, 13.7141f, 4.63f)
                lineTo(13.0f, 5.2428f)
                lineTo(10.0f, 8.2428f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                    = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0029f, 21.923f)
                curveTo(8.0019f, 21.9232f, 8.001f, 21.9234f, 8.0f, 21.9235f)
                verticalLineTo(21.9259f)
                lineTo(8.0029f, 21.923f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8143f, 14.0f)
                horizontalLineTo(17.8994f)
                curveTo(19.2995f, 14.0f, 19.9996f, 14.0f, 20.5344f, 14.2725f)
                curveTo(21.0048f, 14.5122f, 21.3872f, 14.8946f, 21.6269f, 15.365f)
                curveTo(21.8994f, 15.8998f, 21.8994f, 16.5999f, 21.8994f, 18.0f)
                curveTo(21.8994f, 19.4001f, 21.8994f, 20.1002f, 21.6269f, 20.635f)
                curveTo(21.3872f, 21.1054f, 21.0048f, 21.4878f, 20.5344f, 21.7275f)
                curveTo(19.9996f, 22.0f, 19.2995f, 22.0f, 17.8994f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(6.9172f, 22.0f, 7.534f, 22.0f, 8.0007f, 21.9234f)
                lineTo(8.0f, 21.9259f)
                lineTo(8.0029f, 21.923f)
                curveTo(8.2476f, 21.8827f, 8.4511f, 21.8212f, 8.635f, 21.7275f)
                curveTo(9.1054f, 21.4878f, 9.4878f, 21.1054f, 9.7275f, 20.635f)
                curveTo(9.8212f, 20.4511f, 9.8827f, 20.2476f, 9.923f, 20.0029f)
                lineTo(13.2219f, 16.7041f)
                lineTo(15.8143f, 14.0f)
                close()
            }
        }
        .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
