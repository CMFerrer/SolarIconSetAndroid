package com.chiksmedina.solar.linear.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ElectronicDevicesGroup

val ElectronicDevicesGroup.LightbulbBolt: ImageVector
    get() {
        if (_lightbulbBolt != null) {
            return _lightbulbBolt!!
        }
        _lightbulbBolt = Builder(
            name = "LightbulbBolt", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 19.5f)
                horizontalLineTo(9.5f)
                moveTo(14.5f, 19.5f)
                curveTo(14.5f, 18.7865f, 14.5f, 18.4297f, 14.5381f, 18.193f)
                curveTo(14.6609f, 17.4296f, 14.6824f, 17.3815f, 15.1692f, 16.7807f)
                curveTo(15.3201f, 16.5945f, 15.8805f, 16.0927f, 17.0012f, 15.0892f)
                curveTo(18.5349f, 13.7159f, 19.5f, 11.7206f, 19.5f, 9.5f)
                curveTo(19.5f, 5.3579f, 16.1421f, 2.0f, 12.0f, 2.0f)
                curveTo(7.8579f, 2.0f, 4.5f, 5.3579f, 4.5f, 9.5f)
                curveTo(4.5f, 11.7206f, 5.4651f, 13.7159f, 6.9988f, 15.0892f)
                curveTo(8.1194f, 16.0927f, 8.6799f, 16.5945f, 8.8308f, 16.7807f)
                curveTo(9.3176f, 17.3815f, 9.3391f, 17.4296f, 9.4619f, 18.193f)
                curveTo(9.5f, 18.4297f, 9.5f, 18.7865f, 9.5f, 19.5f)
                moveTo(14.5f, 19.5f)
                curveTo(14.5f, 20.4346f, 14.5f, 20.9019f, 14.299f, 21.25f)
                curveTo(14.1674f, 21.478f, 13.978f, 21.6674f, 13.75f, 21.799f)
                curveTo(13.4019f, 22.0f, 12.9346f, 22.0f, 12.0f, 22.0f)
                curveTo(11.0654f, 22.0f, 10.5981f, 22.0f, 10.25f, 21.799f)
                curveTo(10.022f, 21.6674f, 9.8326f, 21.478f, 9.701f, 21.25f)
                curveTo(9.5f, 20.9019f, 9.5f, 20.4346f, 9.5f, 19.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.7856f, 8.5f)
                lineTo(10.6427f, 11.5f)
                horizontalLineTo(13.6427f)
                lineTo(11.4999f, 14.5f)
            }
        }
            .build()
        return _lightbulbBolt!!
    }

private var _lightbulbBolt: ImageVector? = null
