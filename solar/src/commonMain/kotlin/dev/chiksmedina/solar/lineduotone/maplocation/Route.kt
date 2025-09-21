package dev.chiksmedina.solar.lineduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.MapLocationGroup

val MapLocationGroup.Route: ImageVector
    get() {
        if (_route != null) {
            return _route!!
        }
        _route = Builder(
            name = "Route", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.1421f, 6.1421f)
                curveTo(8.9036f, 3.3807f, 10.2843f, 2.0f, 12.0f, 2.0f)
                curveTo(13.7157f, 2.0f, 15.0964f, 3.3807f, 17.8579f, 6.1421f)
                curveTo(20.6193f, 8.9036f, 22.0f, 10.2843f, 22.0f, 12.0f)
                curveTo(22.0f, 13.7157f, 20.6193f, 15.0964f, 17.8579f, 17.8579f)
                curveTo(15.0964f, 20.6193f, 13.7157f, 22.0f, 12.0f, 22.0f)
                curveTo(10.2843f, 22.0f, 8.9036f, 20.6193f, 6.1421f, 17.8579f)
                curveTo(3.3807f, 15.0964f, 2.0f, 13.7157f, 2.0f, 12.0f)
                curveTo(2.0f, 10.2843f, 3.3807f, 8.9036f, 6.1421f, 6.1421f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.25f, 14.0f)
                curveTo(8.25f, 14.4142f, 8.5858f, 14.75f, 9.0f, 14.75f)
                curveTo(9.4142f, 14.75f, 9.75f, 14.4142f, 9.75f, 14.0f)
                horizontalLineTo(8.25f)
                close()
                moveTo(15.0f, 12.0f)
                lineTo(15.5303f, 12.5303f)
                curveTo(15.8232f, 12.2374f, 15.8232f, 11.7626f, 15.5303f, 11.4697f)
                lineTo(15.0f, 12.0f)
                close()
                moveTo(13.5303f, 9.4697f)
                curveTo(13.2374f, 9.1768f, 12.7626f, 9.1768f, 12.4697f, 9.4697f)
                curveTo(12.1768f, 9.7626f, 12.1768f, 10.2374f, 12.4697f, 10.5303f)
                lineTo(13.5303f, 9.4697f)
                close()
                moveTo(12.4697f, 13.4697f)
                curveTo(12.1768f, 13.7626f, 12.1768f, 14.2374f, 12.4697f, 14.5303f)
                curveTo(12.7626f, 14.8232f, 13.2374f, 14.8232f, 13.5303f, 14.5303f)
                lineTo(12.4697f, 13.4697f)
                close()
                moveTo(11.0f, 12.75f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.75f)
                close()
                moveTo(15.5303f, 11.4697f)
                lineTo(13.5303f, 9.4697f)
                lineTo(12.4697f, 10.5303f)
                lineTo(14.4697f, 12.5303f)
                lineTo(15.5303f, 11.4697f)
                close()
                moveTo(14.4697f, 11.4697f)
                lineTo(12.4697f, 13.4697f)
                lineTo(13.5303f, 14.5303f)
                lineTo(15.5303f, 12.5303f)
                lineTo(14.4697f, 11.4697f)
                close()
                moveTo(9.75f, 14.0f)
                curveTo(9.75f, 13.5074f, 9.7516f, 13.2134f, 9.7799f, 13.0027f)
                curveTo(9.7929f, 12.9061f, 9.8082f, 12.8577f, 9.8172f, 12.836f)
                curveTo(9.8192f, 12.8309f, 9.8209f, 12.8276f, 9.8219f, 12.8257f)
                curveTo(9.8229f, 12.8238f, 9.8234f, 12.8229f, 9.8235f, 12.8228f)
                curveTo(9.8235f, 12.8228f, 9.8233f, 12.823f, 9.8231f, 12.8234f)
                curveTo(9.8228f, 12.8237f, 9.8228f, 12.8237f, 9.8232f, 12.8232f)
                lineTo(8.7626f, 11.7626f)
                curveTo(8.4535f, 12.0716f, 8.3411f, 12.4473f, 8.2933f, 12.8028f)
                curveTo(8.2484f, 13.1367f, 8.25f, 13.5498f, 8.25f, 14.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(11.0f, 11.25f)
                curveTo(10.5498f, 11.25f, 10.1367f, 11.2484f, 9.8028f, 11.2933f)
                curveTo(9.4473f, 11.3411f, 9.0716f, 11.4535f, 8.7626f, 11.7626f)
                lineTo(9.8232f, 12.8232f)
                curveTo(9.8237f, 12.8228f, 9.8237f, 12.8228f, 9.8233f, 12.8231f)
                curveTo(9.823f, 12.8234f, 9.8228f, 12.8235f, 9.8228f, 12.8235f)
                curveTo(9.8229f, 12.8234f, 9.8238f, 12.8229f, 9.8257f, 12.8219f)
                curveTo(9.8276f, 12.8209f, 9.8309f, 12.8192f, 9.836f, 12.8172f)
                curveTo(9.8577f, 12.8082f, 9.9061f, 12.7929f, 10.0027f, 12.7799f)
                curveTo(10.2134f, 12.7516f, 10.5074f, 12.75f, 11.0f, 12.75f)
                verticalLineTo(11.25f)
                close()
            }
        }
            .build()
        return _route!!
    }

private var _route: ImageVector? = null
