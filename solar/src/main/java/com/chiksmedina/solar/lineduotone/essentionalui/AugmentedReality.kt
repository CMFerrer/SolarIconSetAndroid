package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.AugmentedReality: ImageVector
    get() {
        if (_augmentedReality != null) {
            return _augmentedReality!!
        }
        _augmentedReality = Builder(
            name = "AugmentedReality", defaultWidth = 24.0.dp, defaultHeight
            = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 8.0f)
                verticalLineTo(7.25f)
                curveTo(13.5858f, 7.25f, 13.25f, 7.5858f, 13.25f, 8.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(13.25f, 16.0f)
                curveTo(13.25f, 16.4142f, 13.5858f, 16.75f, 14.0f, 16.75f)
                curveTo(14.4142f, 16.75f, 14.75f, 16.4142f, 14.75f, 16.0f)
                horizontalLineTo(13.25f)
                close()
                moveTo(8.5f, 8.0f)
                lineTo(9.2159f, 7.7763f)
                curveTo(9.118f, 7.4632f, 8.828f, 7.25f, 8.5f, 7.25f)
                curveTo(8.172f, 7.25f, 7.882f, 7.4632f, 7.7841f, 7.7763f)
                lineTo(8.5f, 8.0f)
                close()
                moveTo(6.875f, 13.2f)
                lineTo(6.1591f, 12.9763f)
                lineTo(6.875f, 13.2f)
                close()
                moveTo(5.2841f, 15.7763f)
                curveTo(5.1606f, 16.1717f, 5.3809f, 16.5923f, 5.7763f, 16.7159f)
                curveTo(6.1716f, 16.8394f, 6.5923f, 16.6191f, 6.7159f, 16.2237f)
                lineTo(5.2841f, 15.7763f)
                close()
                moveTo(10.2841f, 16.2237f)
                curveTo(10.4077f, 16.6191f, 10.8283f, 16.8394f, 11.2237f, 16.7159f)
                curveTo(11.6191f, 16.5923f, 11.8394f, 16.1717f, 11.7159f, 15.7763f)
                lineTo(10.2841f, 16.2237f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineTo(13.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(17.364f, 16.3975f)
                curveTo(17.5835f, 16.7488f, 18.0462f, 16.8555f, 18.3975f, 16.636f)
                curveTo(18.7488f, 16.4165f, 18.8555f, 15.9538f, 18.636f, 15.6025f)
                lineTo(17.364f, 16.3975f)
                close()
                moveTo(7.7841f, 7.7763f)
                lineTo(6.1591f, 12.9763f)
                lineTo(7.5909f, 13.4237f)
                lineTo(9.2159f, 8.2237f)
                lineTo(7.7841f, 7.7763f)
                close()
                moveTo(6.1591f, 12.9763f)
                lineTo(5.2841f, 15.7763f)
                lineTo(6.7159f, 16.2237f)
                lineTo(7.5909f, 13.4237f)
                lineTo(6.1591f, 12.9763f)
                close()
                moveTo(7.7841f, 8.2237f)
                lineTo(9.4091f, 13.4237f)
                lineTo(10.8409f, 12.9763f)
                lineTo(9.2159f, 7.7763f)
                lineTo(7.7841f, 8.2237f)
                close()
                moveTo(9.4091f, 13.4237f)
                lineTo(10.2841f, 16.2237f)
                lineTo(11.7159f, 15.7763f)
                lineTo(10.8409f, 12.9763f)
                lineTo(9.4091f, 13.4237f)
                close()
                moveTo(6.875f, 13.95f)
                horizontalLineTo(10.125f)
                verticalLineTo(12.45f)
                horizontalLineTo(6.875f)
                verticalLineTo(13.95f)
                close()
                moveTo(14.0f, 8.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.25f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.75f)
                close()
                moveTo(14.75f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.75f)
                close()
                moveTo(17.25f, 10.0f)
                curveTo(17.25f, 10.6904f, 16.6904f, 11.25f, 16.0f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(17.5188f, 12.75f, 18.75f, 11.5188f, 18.75f, 10.0f)
                horizontalLineTo(17.25f)
                close()
                moveTo(16.0f, 8.75f)
                curveTo(16.6904f, 8.75f, 17.25f, 9.3096f, 17.25f, 10.0f)
                horizontalLineTo(18.75f)
                curveTo(18.75f, 8.4812f, 17.5188f, 7.25f, 16.0f, 7.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(13.25f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.25f)
                close()
                moveTo(16.0f, 11.25f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.25f)
                close()
                moveTo(15.5f, 11.25f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.25f)
                close()
                moveTo(14.864f, 12.3975f)
                lineTo(17.364f, 16.3975f)
                lineTo(18.636f, 15.6025f)
                lineTo(16.136f, 11.6025f)
                lineTo(14.864f, 12.3975f)
                close()
            }
        }
            .build()
        return _augmentedReality!!
    }

private var _augmentedReality: ImageVector? = null
