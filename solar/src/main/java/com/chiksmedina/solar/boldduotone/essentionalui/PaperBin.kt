package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.PaperBin: ImageVector
    get() {
        if (_paperBin != null) {
            return _paperBin!!
        }
        _paperBin = Builder(
            name = "PaperBin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0336f, 8.89f)
                curveTo(2.5531f, 5.6865f, 2.3128f, 4.0847f, 3.2105f, 3.0423f)
                curveTo(4.1081f, 2.0f, 5.7278f, 2.0f, 8.9673f, 2.0f)
                horizontalLineTo(15.033f)
                curveTo(18.2724f, 2.0f, 19.8922f, 2.0f, 20.7898f, 3.0423f)
                curveTo(21.6874f, 4.0847f, 21.4472f, 5.6865f, 20.9666f, 8.89f)
                lineTo(19.7666f, 16.89f)
                curveTo(19.401f, 19.3276f, 19.2182f, 20.5464f, 18.3743f, 21.2732f)
                curveTo(17.5303f, 22.0f, 16.2979f, 22.0f, 13.833f, 22.0f)
                horizontalLineTo(10.1673f)
                curveTo(7.7024f, 22.0f, 6.47f, 22.0f, 5.626f, 21.2732f)
                curveTo(4.7821f, 20.5464f, 4.5993f, 19.3276f, 4.2337f, 16.89f)
                lineTo(3.0336f, 8.89f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.5175f, 12.1152f)
                lineTo(3.2275f, 10.1817f)
                lineTo(5.0718f, 8.1324f)
                lineTo(3.6894f, 6.75f)
                horizontalLineTo(2.7298f)
                curveTo(2.6603f, 6.1832f, 2.6156f, 5.6875f, 2.6067f, 5.25f)
                horizontalLineTo(21.3937f)
                curveTo(21.3848f, 5.6875f, 21.3402f, 6.1832f, 21.2707f, 6.75f)
                horizontalLineTo(20.3107f)
                lineTo(18.9283f, 8.1324f)
                lineTo(20.7729f, 10.182f)
                lineTo(20.483f, 12.1148f)
                lineTo(18.8826f, 13.8219f)
                lineTo(20.0516f, 14.9909f)
                lineTo(19.7749f, 16.8355f)
                lineTo(17.8562f, 14.9168f)
                lineTo(15.9794f, 16.9187f)
                lineTo(17.3107f, 18.25f)
                horizontalLineTo(19.5563f)
                curveTo(19.4584f, 18.8397f, 19.3613f, 19.3331f, 19.2423f, 19.75f)
                horizontalLineTo(4.7582f)
                curveTo(4.6391f, 19.3331f, 4.542f, 18.8397f, 4.4442f, 18.25f)
                horizontalLineTo(6.6894f)
                lineTo(8.0208f, 16.9187f)
                lineTo(6.144f, 14.9168f)
                lineTo(4.2255f, 16.8352f)
                lineTo(3.9488f, 14.9906f)
                lineTo(5.1175f, 13.8219f)
                lineTo(3.5175f, 12.1152f)
                close()
                moveTo(6.0767f, 7.016f)
                lineTo(5.8107f, 6.75f)
                horizontalLineTo(6.3161f)
                lineTo(6.0767f, 7.016f)
                close()
                moveTo(7.1388f, 8.0781f)
                lineTo(8.3341f, 6.75f)
                horizontalLineTo(9.6894f)
                lineTo(10.9394f, 8.0f)
                lineTo(9.0001f, 9.9393f)
                lineTo(7.1388f, 8.0781f)
                close()
                moveTo(12.0001f, 6.9393f)
                lineTo(11.8107f, 6.75f)
                horizontalLineTo(12.1894f)
                lineTo(12.0001f, 6.9393f)
                close()
                moveTo(13.0607f, 8.0f)
                lineTo(14.3107f, 6.75f)
                horizontalLineTo(15.666f)
                lineTo(16.8613f, 8.0781f)
                lineTo(15.0001f, 9.9393f)
                lineTo(13.0607f, 8.0f)
                close()
                moveTo(17.9235f, 7.016f)
                lineTo(17.6841f, 6.75f)
                horizontalLineTo(18.1894f)
                lineTo(17.9235f, 7.016f)
                close()
                moveTo(16.0607f, 11.0f)
                lineTo(17.8662f, 9.1946f)
                lineTo(19.4817f, 10.9896f)
                lineTo(17.8214f, 12.7607f)
                lineTo(16.0607f, 11.0f)
                close()
                moveTo(15.0001f, 12.0607f)
                lineTo(16.795f, 13.8555f)
                lineTo(14.9182f, 15.8574f)
                lineTo(13.0607f, 14.0f)
                lineTo(15.0001f, 12.0607f)
                close()
                moveTo(12.0001f, 15.0607f)
                lineTo(13.8917f, 16.9523f)
                lineTo(12.6751f, 18.25f)
                horizontalLineTo(11.325f)
                lineTo(10.1084f, 16.9523f)
                lineTo(12.0001f, 15.0607f)
                close()
                moveTo(15.1894f, 18.25f)
                horizontalLineTo(14.7312f)
                lineTo(14.9529f, 18.0135f)
                lineTo(15.1894f, 18.25f)
                close()
                moveTo(9.0472f, 18.0135f)
                lineTo(9.2689f, 18.25f)
                horizontalLineTo(8.8107f)
                lineTo(9.0472f, 18.0135f)
                close()
                moveTo(10.9394f, 14.0f)
                lineTo(9.082f, 15.8574f)
                lineTo(7.2052f, 13.8555f)
                lineTo(9.0001f, 12.0607f)
                lineTo(10.9394f, 14.0f)
                close()
                moveTo(7.9394f, 11.0f)
                lineTo(6.1787f, 12.7607f)
                lineTo(4.5184f, 10.9896f)
                lineTo(6.134f, 9.1946f)
                lineTo(7.9394f, 11.0f)
                close()
                moveTo(12.0001f, 12.9393f)
                lineTo(10.0607f, 11.0f)
                lineTo(12.0001f, 9.0607f)
                lineTo(13.9394f, 11.0f)
                lineTo(12.0001f, 12.9393f)
                close()
            }
        }
            .build()
        return _paperBin!!
    }

private var _paperBin: ImageVector? = null
