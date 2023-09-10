package com.chiksmedina.solar.broken.security

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
import com.chiksmedina.solar.broken.SecurityGroup

val SecurityGroup.Siren: ImageVector
    get() {
        if (_siren != null) {
            return _siren!!
        }
        _siren = Builder(
            name = "Siren", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.0f, 22.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 13.1997f, 20.0f, 11.7996f, 19.455f, 10.73f)
                curveTo(18.9757f, 9.7892f, 18.2108f, 9.0243f, 17.27f, 8.545f)
                curveTo(16.2004f, 8.0f, 14.8003f, 8.0f, 12.0f, 8.0f)
                curveTo(9.1997f, 8.0f, 7.7996f, 8.0f, 6.7301f, 8.545f)
                curveTo(5.7892f, 9.0243f, 5.0243f, 9.7892f, 4.545f, 10.73f)
                curveTo(4.3568f, 11.0993f, 4.2336f, 11.5079f, 4.153f, 12.0f)
                moveTo(4.0f, 22.0f)
                verticalLineTo(16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 10.8149f)
                curveTo(16.23f, 10.8149f, 17.23f, 11.77f, 17.1851f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 22.0f)
                horizontalLineTo(14.0f)
                moveTo(22.0f, 22.0f)
                horizontalLineTo(18.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 5.0f)
                lineTo(19.5f, 6.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 5.0f)
                lineTo(4.5f, 6.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 18.3284f, 12.8284f, 19.0f, 12.0f, 19.0f)
                curveTo(11.1716f, 19.0f, 10.5f, 18.3284f, 10.5f, 17.5f)
                curveTo(10.5f, 16.6716f, 11.1716f, 16.0f, 12.0f, 16.0f)
                curveTo(12.8284f, 16.0f, 13.5f, 16.6716f, 13.5f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.0f)
                verticalLineTo(22.0f)
            }
        }
            .build()
        return _siren!!
    }

private var _siren: ImageVector? = null
