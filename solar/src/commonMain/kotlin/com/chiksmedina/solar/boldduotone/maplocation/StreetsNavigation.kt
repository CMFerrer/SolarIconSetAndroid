package com.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.StreetsNavigation: ImageVector
    get() {
        if (_streetsNavigation != null) {
            return _streetsNavigation!!
        }
        _streetsNavigation = Builder(
            name = "StreetsNavigation", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.3226f, 3.7861f)
                lineTo(15.1069f, 10.4161f)
                lineTo(21.2865f, 15.2715f)
                curveTo(22.0f, 14.1679f, 22.0f, 12.534f, 22.0f, 9.5002f)
                curveTo(22.0f, 6.5185f, 22.0f, 4.8889f, 21.3226f, 3.7861f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.2673f, 19.2006f)
                lineTo(13.932f, 16.5295f)
                curveTo(13.089f, 14.8432f, 12.6675f, 14.0f, 12.0f, 14.0f)
                curveTo(11.3325f, 14.0f, 10.911f, 14.8432f, 10.068f, 16.5295f)
                lineTo(8.7327f, 19.2006f)
                curveTo(8.2209f, 20.2245f, 7.9649f, 20.7365f, 8.0039f, 21.0588f)
                curveTo(8.0601f, 21.5245f, 8.4104f, 21.9006f, 8.8708f, 21.9897f)
                curveTo(9.1895f, 22.0514f, 9.7182f, 21.8324f, 10.7757f, 21.3943f)
                curveTo(11.1669f, 21.2322f, 11.3625f, 21.1512f, 11.5629f, 21.1097f)
                curveTo(11.8513f, 21.0501f, 12.1487f, 21.0501f, 12.4371f, 21.1097f)
                curveTo(12.6375f, 21.1512f, 12.8331f, 21.2322f, 13.2243f, 21.3943f)
                curveTo(14.2818f, 21.8324f, 14.8105f, 22.0514f, 15.1292f, 21.9897f)
                curveTo(15.5896f, 21.9006f, 15.9399f, 21.5245f, 15.9961f, 21.0588f)
                curveTo(16.0351f, 20.7365f, 15.7791f, 20.2245f, 15.2673f, 19.2006f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 9.5003f)
                curveTo(2.0f, 9.5136f, 2.0f, 9.5268f, 2.0f, 9.54f)
                curveTo(2.0f, 12.8009f, 2.0037f, 14.4361f, 2.908f, 15.5379f)
                curveTo(3.0742f, 15.7405f, 3.2599f, 15.9262f, 3.4624f, 16.0924f)
                curveTo(3.6434f, 16.2409f, 3.8388f, 16.3652f, 4.0535f, 16.4691f)
                curveTo(5.1502f, 17.0001f, 6.7492f, 17.0001f, 9.4973f, 17.0001f)
                horizontalLineTo(9.4998f)
                horizontalLineTo(14.4998f)
                lineTo(15.8427f, 16.9975f)
                curveTo(16.6828f, 16.9917f, 17.3922f, 16.9742f, 18.0f, 16.9212f)
                curveTo(18.9436f, 16.8389f, 19.6422f, 16.6711f, 20.2042f, 16.3289f)
                lineTo(13.5476f, 11.0987f)
                lineTo(2.9611f, 3.3994f)
                curveTo(2.9432f, 3.4204f, 2.9255f, 3.4415f, 2.908f, 3.4628f)
                curveTo(2.0f, 4.5691f, 2.0f, 6.2129f, 2.0f, 9.5003f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(6.8838f, 2.0f, 5.3086f, 2.0f, 4.2168f, 2.4576f)
                lineTo(13.9056f, 9.504f)
                lineTo(20.2716f, 2.7137f)
                curveTo(19.168f, 2.0f, 17.534f, 2.0f, 14.5f, 2.0f)
                close()
            }
        }
            .build()
        return _streetsNavigation!!
    }

private var _streetsNavigation: ImageVector? = null
