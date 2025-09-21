package dev.chiksmedina.solar.bold.transportpartsservice

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.TransportPartsServiceGroup

val TransportPartsServiceGroup.WheelAngle: ImageVector
    get() {
        if (_wheelAngle != null) {
            return _wheelAngle!!
        }
        _wheelAngle = Builder(
            name = "WheelAngle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 17.5228f, 18.9277f, 22.0f, 16.3714f, 22.0f)
                horizontalLineTo(8.6571f)
                curveTo(9.5236f, 21.4385f, 10.3126f, 20.4506f, 10.8562f, 19.2763f)
                curveTo(11.73f, 17.3884f, 12.2571f, 14.8154f, 12.2571f, 12.0f)
                curveTo(12.2571f, 9.1846f, 11.73f, 6.6116f, 10.8562f, 4.7238f)
                curveTo(10.3126f, 3.5494f, 9.5236f, 2.5615f, 8.6571f, 2.0f)
                horizontalLineTo(16.3714f)
                curveTo(18.9277f, 2.0f, 21.0f, 6.4771f, 21.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1C274C)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.3104f, 5.1341f)
                curveTo(3.509f, 6.8655f, 3.0f, 9.2925f, 3.0f, 12.0f)
                curveTo(3.0f, 14.7075f, 3.509f, 17.1345f, 4.3104f, 18.8659f)
                curveTo(5.1335f, 20.6442f, 6.1646f, 21.5f, 7.1143f, 21.5f)
                curveTo(8.064f, 21.5f, 9.0951f, 20.6442f, 9.9182f, 18.8659f)
                curveTo(10.7196f, 17.1345f, 11.2286f, 14.7075f, 11.2286f, 12.0f)
                curveTo(11.2286f, 9.2925f, 10.7196f, 6.8655f, 9.9182f, 5.1341f)
                curveTo(9.0951f, 3.3558f, 8.064f, 2.5f, 7.1143f, 2.5f)
                curveTo(6.1646f, 2.5f, 5.1335f, 3.3558f, 4.3104f, 5.1341f)
                close()
                moveTo(5.5714f, 12.0f)
                curveTo(5.5714f, 15.3137f, 6.2622f, 18.0f, 7.1143f, 18.0f)
                curveTo(7.9011f, 18.0f, 8.5503f, 15.7097f, 8.6452f, 12.75f)
                horizontalLineTo(7.6286f)
                curveTo(7.2025f, 12.75f, 6.8571f, 12.4142f, 6.8571f, 12.0f)
                curveTo(6.8571f, 11.5858f, 7.2025f, 11.25f, 7.6286f, 11.25f)
                horizontalLineTo(8.6452f)
                curveTo(8.5503f, 8.2903f, 7.9011f, 6.0f, 7.1143f, 6.0f)
                curveTo(6.2622f, 6.0f, 5.5714f, 8.6863f, 5.5714f, 12.0f)
                close()
            }
        }
            .build()
        return _wheelAngle!!
    }

private var _wheelAngle: ImageVector? = null
