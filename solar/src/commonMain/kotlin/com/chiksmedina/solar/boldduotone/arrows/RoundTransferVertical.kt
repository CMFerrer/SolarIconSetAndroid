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

val ArrowsGroup.RoundTransferVertical: ImageVector
    get() {
        if (_roundTransferVertical != null) {
            return _roundTransferVertical!!
        }
        _roundTransferVertical = Builder(
            name = "RoundTransferVertical", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5651f, 13.0693f)
                curveTo(7.2927f, 12.7572f, 6.8189f, 12.725f, 6.5069f, 12.9974f)
                curveTo(6.1948f, 13.2698f, 6.1626f, 13.7435f, 6.4349f, 14.0556f)
                lineTo(9.4349f, 17.4931f)
                curveTo(9.6405f, 17.7287f, 9.9706f, 17.812f, 10.2634f, 17.7022f)
                curveTo(10.5561f, 17.5924f, 10.75f, 17.3126f, 10.75f, 17.0f)
                lineTo(10.75f, 7.0f)
                curveTo(10.75f, 6.5858f, 10.4142f, 6.25f, 10.0f, 6.25f)
                curveTo(9.5858f, 6.25f, 9.25f, 6.5858f, 9.25f, 7.0f)
                lineTo(9.25f, 15.0f)
                lineTo(7.5651f, 13.0693f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.75f, 17.0f)
                lineTo(14.75f, 9.0f)
                lineTo(16.4349f, 10.9306f)
                curveTo(16.7073f, 11.2427f, 17.1811f, 11.2749f, 17.4932f, 11.0025f)
                curveTo(17.8052f, 10.7302f, 17.8374f, 10.2564f, 17.5651f, 9.9443f)
                lineTo(14.5651f, 6.5068f)
                curveTo(14.3595f, 6.2713f, 14.0294f, 6.188f, 13.7367f, 6.2977f)
                curveTo(13.4439f, 6.4075f, 13.25f, 6.6873f, 13.25f, 7.0f)
                lineTo(13.25f, 12.0f)
                lineTo(13.25f, 17.0f)
                curveTo(13.25f, 17.4142f, 13.5858f, 17.75f, 14.0f, 17.75f)
                curveTo(14.4142f, 17.75f, 14.75f, 17.4142f, 14.75f, 17.0f)
                close()
            }
        }
            .build()
        return _roundTransferVertical!!
    }

private var _roundTransferVertical: ImageVector? = null
