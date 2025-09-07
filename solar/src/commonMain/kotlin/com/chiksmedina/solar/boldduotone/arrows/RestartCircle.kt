package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.RestartCircle: ImageVector
    get() {
        if (_restartCircle != null) {
            return _restartCircle!!
        }
        _restartCircle = Builder(
            name = "RestartCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.4017f, 6.2862f)
                curveTo(16.4017f, 5.9812f, 16.217f, 5.7066f, 15.9346f, 5.5916f)
                curveTo(15.6522f, 5.4765f, 15.3283f, 5.5439f, 15.1152f, 5.7621f)
                lineTo(14.3647f, 6.5304f)
                curveTo(12.244f, 5.5546f, 9.6655f, 5.9591f, 7.928f, 7.7378f)
                curveTo(5.6907f, 10.0281f, 5.6907f, 13.7344f, 7.928f, 16.0247f)
                curveTo(10.1748f, 18.3248f, 13.8252f, 18.3248f, 16.072f, 16.0247f)
                curveTo(17.3754f, 14.6904f, 17.9168f, 12.8779f, 17.7055f, 11.1507f)
                curveTo(17.6552f, 10.7396f, 17.2812f, 10.447f, 16.87f, 10.4973f)
                curveTo(16.4589f, 10.5476f, 16.1663f, 10.9217f, 16.2166f, 11.3328f)
                curveTo(16.3757f, 12.6335f, 15.9667f, 13.9859f, 14.999f, 14.9765f)
                curveTo(13.3407f, 16.6742f, 10.6593f, 16.6742f, 9.001f, 14.9765f)
                curveTo(7.333f, 13.269f, 7.333f, 10.4935f, 9.001f, 8.786f)
                curveTo(10.1467f, 7.613f, 11.7795f, 7.2514f, 13.225f, 7.6971f)
                lineTo(12.4635f, 8.4766f)
                curveTo(12.2527f, 8.6924f, 12.1917f, 9.0136f, 12.3088f, 9.2917f)
                curveTo(12.4259f, 9.5698f, 12.6983f, 9.7507f, 13.0f, 9.7507f)
                horizontalLineTo(15.6517f)
                curveTo(16.0659f, 9.7507f, 16.4017f, 9.4149f, 16.4017f, 9.0007f)
                verticalLineTo(6.2862f)
                close()
            }
        }
            .build()
        return _restartCircle!!
    }

private var _restartCircle: ImageVector? = null
