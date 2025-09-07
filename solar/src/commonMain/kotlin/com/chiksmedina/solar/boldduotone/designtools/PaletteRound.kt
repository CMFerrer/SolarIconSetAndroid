package com.chiksmedina.solar.boldduotone.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

val DesignToolsGroup.PaletteRound: ImageVector
    get() {
        if (_paletteRound != null) {
            return _paletteRound!!
        }
        _paletteRound = Builder(
            name = "PaletteRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.0f, 18.0f)
                curveTo(7.0f, 18.5523f, 6.5523f, 19.0f, 6.0f, 19.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                curveTo(5.0f, 17.4477f, 5.4477f, 17.0f, 6.0f, 17.0f)
                curveTo(6.5523f, 17.0f, 7.0f, 17.4477f, 7.0f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 20.2091f, 8.2091f, 22.0f, 6.0f, 22.0f)
                curveTo(3.7909f, 22.0f, 2.0f, 20.2091f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 3.7909f, 3.7909f, 2.0f, 6.0f, 2.0f)
                curveTo(8.2091f, 2.0f, 10.0f, 3.7909f, 10.0f, 6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.7f, strokeAlpha
                = 0.7f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.2476f, 20.336f)
                lineTo(13.2218f, 16.3617f)
                lineTo(19.0599f, 10.2721f)
                curveTo(20.5819f, 8.6846f, 20.5554f, 6.1716f, 19.0003f, 4.6165f)
                curveTo(17.4218f, 3.038f, 14.8624f, 3.038f, 13.2838f, 4.6165f)
                lineTo(10.0f, 7.9004f)
                verticalLineTo(18.0002f)
                curveTo(10.0f, 18.8721f, 9.7211f, 19.6788f, 9.2476f, 20.336f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.2218f, 16.3617f)
                lineTo(9.2476f, 20.336f)
                curveTo(9.7201f, 19.6801f, 9.9989f, 18.8752f, 10.0f, 18.0053f)
                curveTo(9.9971f, 20.212f, 8.2074f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(17.8994f)
                curveTo(20.1086f, 22.0f, 21.8994f, 20.2091f, 21.8994f, 18.0f)
                curveTo(21.8994f, 15.7909f, 20.1086f, 14.0f, 17.8994f, 14.0f)
                horizontalLineTo(15.486f)
                lineTo(13.2218f, 16.3617f)
                close()
            }
        }
            .build()
        return _paletteRound!!
    }

private var _paletteRound: ImageVector? = null
