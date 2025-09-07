package com.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MapLocationGroup

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
                moveTo(14.5f, 2.0f)
                horizontalLineTo(9.5f)
                curveTo(6.8838f, 2.0f, 5.3086f, 2.0f, 4.2168f, 2.4576f)
                lineTo(13.9057f, 9.504f)
                lineTo(20.2716f, 2.7137f)
                curveTo(19.168f, 2.0f, 17.534f, 2.0f, 14.5f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.3225f, 3.7859f)
                lineTo(15.1069f, 10.4159f)
                lineTo(21.2865f, 15.2713f)
                curveTo(22.0f, 14.1677f, 22.0f, 12.5337f, 22.0f, 9.5f)
                curveTo(22.0f, 6.5182f, 22.0f, 4.8887f, 21.3225f, 3.7859f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 9.5f)
                curveTo(2.0f, 12.7875f, 2.0f, 14.4312f, 2.908f, 15.5376f)
                curveTo(3.0742f, 15.7401f, 3.2599f, 15.9258f, 3.4624f, 16.092f)
                curveTo(4.0782f, 16.5974f, 4.8605f, 16.8215f, 6.0f, 16.9208f)
                curveTo(6.6078f, 16.9738f, 7.3172f, 16.9914f, 8.1573f, 16.9971f)
                lineTo(8.7263f, 15.8587f)
                lineTo(8.7724f, 15.7666f)
                curveTo(9.1538f, 15.0034f, 9.5118f, 14.287f, 9.8697f, 13.774f)
                curveTo(10.2357f, 13.2495f, 10.8992f, 12.5f, 12.0f, 12.5f)
                curveTo(13.1008f, 12.5f, 13.7643f, 13.2495f, 14.1303f, 13.774f)
                curveTo(14.4883f, 14.287f, 14.8462f, 15.0034f, 15.2276f, 15.7666f)
                lineTo(15.2737f, 15.8587f)
                lineTo(15.8427f, 16.9971f)
                curveTo(16.6828f, 16.9914f, 17.3922f, 16.9738f, 18.0f, 16.9208f)
                curveTo(18.9436f, 16.8386f, 19.6422f, 16.6708f, 20.2042f, 16.3286f)
                lineTo(13.5476f, 11.0983f)
                lineTo(2.9611f, 3.3991f)
                curveTo(2.9432f, 3.42f, 2.9255f, 3.4411f, 2.908f, 3.4624f)
                curveTo(2.0f, 4.5688f, 2.0f, 6.2125f, 2.0f, 9.5f)
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
        }
            .build()
        return _streetsNavigation!!
    }

private var _streetsNavigation: ImageVector? = null
