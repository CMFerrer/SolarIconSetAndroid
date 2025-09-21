package dev.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.SsdRound: ImageVector
    get() {
        if (_ssdRound != null) {
            return _ssdRound!!
        }
        _ssdRound = Builder(
            name = "SsdRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.5622f, 2.8717f)
                curveTo(6.1486f, 2.4146f, 6.8236f, 2.25f, 7.5f, 2.25f)
                horizontalLineTo(16.5f)
                curveTo(17.1765f, 2.25f, 17.8514f, 2.4146f, 18.4378f, 2.8717f)
                curveTo(19.0172f, 3.3234f, 19.4352f, 4.0024f, 19.7154f, 4.8924f)
                lineTo(19.7225f, 4.9151f)
                lineTo(22.2604f, 15.2159f)
                curveTo(22.5738f, 15.8383f, 22.75f, 16.5463f, 22.75f, 17.2941f)
                curveTo(22.75f, 19.7141f, 20.887f, 21.75f, 18.5f, 21.75f)
                horizontalLineTo(5.5f)
                curveTo(3.113f, 21.75f, 1.25f, 19.7141f, 1.25f, 17.2941f)
                curveTo(1.25f, 16.5463f, 1.4262f, 15.8383f, 1.7396f, 15.2159f)
                lineTo(4.2775f, 4.9151f)
                lineTo(4.2846f, 4.8924f)
                curveTo(4.5648f, 4.0024f, 4.9828f, 3.3234f, 5.5622f, 2.8717f)
                close()
                moveTo(3.7763f, 13.2197f)
                curveTo(4.3011f, 12.9752f, 4.8837f, 12.8382f, 5.5f, 12.8382f)
                horizontalLineTo(18.5f)
                curveTo(19.1163f, 12.8382f, 19.6989f, 12.9752f, 20.2237f, 13.2197f)
                lineTo(18.2777f, 5.3209f)
                curveTo(18.0589f, 4.6367f, 17.7822f, 4.2626f, 17.5156f, 4.0547f)
                curveTo(17.2532f, 3.8502f, 16.9281f, 3.75f, 16.5f, 3.75f)
                horizontalLineTo(7.5f)
                curveTo(7.0719f, 3.75f, 6.7468f, 3.8502f, 6.4844f, 4.0547f)
                curveTo(6.2178f, 4.2626f, 5.9411f, 4.6367f, 5.7223f, 5.3209f)
                lineTo(3.7763f, 13.2197f)
                close()
                moveTo(5.5f, 14.3382f)
                curveTo(4.4927f, 14.3382f, 3.5914f, 14.9242f, 3.1091f, 15.8329f)
                curveTo(2.8815f, 16.2618f, 2.75f, 16.7597f, 2.75f, 17.2941f)
                curveTo(2.75f, 18.9676f, 4.021f, 20.25f, 5.5f, 20.25f)
                horizontalLineTo(18.5f)
                curveTo(19.979f, 20.25f, 21.25f, 18.9676f, 21.25f, 17.2941f)
                curveTo(21.25f, 16.7597f, 21.1185f, 16.2618f, 20.8909f, 15.8329f)
                curveTo(20.4086f, 14.9242f, 19.5073f, 14.3382f, 18.5f, 14.3382f)
                horizontalLineTo(5.5f)
                close()
                moveTo(10.5f, 16.25f)
                curveTo(10.9142f, 16.25f, 11.25f, 16.5858f, 11.25f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 18.4142f, 10.9142f, 18.75f, 10.5f, 18.75f)
                curveTo(10.0858f, 18.75f, 9.75f, 18.4142f, 9.75f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(9.75f, 16.5858f, 10.0858f, 16.25f, 10.5f, 16.25f)
                close()
                moveTo(13.0f, 16.25f)
                curveTo(13.4142f, 16.25f, 13.75f, 16.5858f, 13.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(13.75f, 18.4142f, 13.4142f, 18.75f, 13.0f, 18.75f)
                curveTo(12.5858f, 18.75f, 12.25f, 18.4142f, 12.25f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(12.25f, 16.5858f, 12.5858f, 16.25f, 13.0f, 16.25f)
                close()
                moveTo(15.5f, 16.25f)
                curveTo(15.9142f, 16.25f, 16.25f, 16.5858f, 16.25f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(16.25f, 18.4142f, 15.9142f, 18.75f, 15.5f, 18.75f)
                curveTo(15.0858f, 18.75f, 14.75f, 18.4142f, 14.75f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(14.75f, 16.5858f, 15.0858f, 16.25f, 15.5f, 16.25f)
                close()
                moveTo(18.0f, 16.25f)
                curveTo(18.4142f, 16.25f, 18.75f, 16.5858f, 18.75f, 17.0f)
                verticalLineTo(18.0f)
                curveTo(18.75f, 18.4142f, 18.4142f, 18.75f, 18.0f, 18.75f)
                curveTo(17.5858f, 18.75f, 17.25f, 18.4142f, 17.25f, 18.0f)
                verticalLineTo(17.0f)
                curveTo(17.25f, 16.5858f, 17.5858f, 16.25f, 18.0f, 16.25f)
                close()
            }
        }
            .build()
        return _ssdRound!!
    }

private var _ssdRound: ImageVector? = null
