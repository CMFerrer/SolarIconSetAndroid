package dev.chiksmedina.solar.outline.medicine

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
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(
            name = "Virus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.5f, 10.25f)
                curveTo(12.9812f, 10.25f, 11.75f, 11.4812f, 11.75f, 13.0f)
                curveTo(11.75f, 14.5188f, 12.9812f, 15.75f, 14.5f, 15.75f)
                curveTo(16.0188f, 15.75f, 17.25f, 14.5188f, 17.25f, 13.0f)
                curveTo(17.25f, 11.4812f, 16.0188f, 10.25f, 14.5f, 10.25f)
                close()
                moveTo(13.25f, 13.0f)
                curveTo(13.25f, 12.3096f, 13.8096f, 11.75f, 14.5f, 11.75f)
                curveTo(15.1904f, 11.75f, 15.75f, 12.3096f, 15.75f, 13.0f)
                curveTo(15.75f, 13.6904f, 15.1904f, 14.25f, 14.5f, 14.25f)
                curveTo(13.8096f, 14.25f, 13.25f, 13.6904f, 13.25f, 13.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.25f, 9.0f)
                curveTo(8.25f, 8.0335f, 9.0335f, 7.25f, 10.0f, 7.25f)
                curveTo(10.9665f, 7.25f, 11.75f, 8.0335f, 11.75f, 9.0f)
                curveTo(11.75f, 9.9665f, 10.9665f, 10.75f, 10.0f, 10.75f)
                curveTo(9.0335f, 10.75f, 8.25f, 9.9665f, 8.25f, 9.0f)
                close()
                moveTo(10.0f, 8.75f)
                curveTo(9.8619f, 8.75f, 9.75f, 8.8619f, 9.75f, 9.0f)
                curveTo(9.75f, 9.1381f, 9.8619f, 9.25f, 10.0f, 9.25f)
                curveTo(10.1381f, 9.25f, 10.25f, 9.1381f, 10.25f, 9.0f)
                curveTo(10.25f, 8.8619f, 10.1381f, 8.75f, 10.0f, 8.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 14.0f)
                curveTo(9.5523f, 14.0f, 10.0f, 13.5523f, 10.0f, 13.0f)
                curveTo(10.0f, 12.4477f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 12.4477f, 8.0f, 13.0f)
                curveTo(8.0f, 13.5523f, 8.4477f, 14.0f, 9.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.5f, 1.25f)
                curveTo(4.7426f, 1.25f, 5.75f, 2.2574f, 5.75f, 3.5f)
                curveTo(5.75f, 3.8474f, 5.6713f, 4.1763f, 5.5307f, 4.4701f)
                lineTo(7.0366f, 5.9759f)
                curveTo(7.8827f, 5.282f, 8.8819f, 4.7672f, 9.9779f, 4.4878f)
                curveTo(9.8319f, 4.1896f, 9.75f, 3.8544f, 9.75f, 3.5f)
                curveTo(9.75f, 2.2574f, 10.7574f, 1.25f, 12.0f, 1.25f)
                curveTo(13.2426f, 1.25f, 14.25f, 2.2574f, 14.25f, 3.5f)
                curveTo(14.25f, 3.8749f, 14.1583f, 4.2285f, 13.9961f, 4.5394f)
                curveTo(15.0674f, 4.8398f, 16.0481f, 5.3628f, 16.8846f, 6.0547f)
                lineTo(17.4693f, 5.4701f)
                curveTo(17.3287f, 5.1763f, 17.25f, 4.8474f, 17.25f, 4.5f)
                curveTo(17.25f, 3.2574f, 18.2574f, 2.25f, 19.5f, 2.25f)
                curveTo(20.7426f, 2.25f, 21.75f, 3.2574f, 21.75f, 4.5f)
                curveTo(21.75f, 5.7426f, 20.7426f, 6.75f, 19.5f, 6.75f)
                curveTo(19.1526f, 6.75f, 18.8237f, 6.6713f, 18.5299f, 6.5307f)
                lineTo(17.9453f, 7.1154f)
                curveTo(18.5828f, 7.8861f, 19.0769f, 8.7792f, 19.3857f, 9.7529f)
                curveTo(19.4236f, 9.751f, 19.4617f, 9.75f, 19.5f, 9.75f)
                curveTo(20.7426f, 9.75f, 21.75f, 10.7574f, 21.75f, 12.0f)
                curveTo(21.75f, 13.2426f, 20.7426f, 14.25f, 19.5f, 14.25f)
                curveTo(19.4835f, 14.25f, 19.467f, 14.2498f, 19.4505f, 14.2495f)
                curveTo(19.093f, 15.49f, 18.4312f, 16.5984f, 17.5501f, 17.4894f)
                lineTo(17.5797f, 17.5191f)
                curveTo(17.8735f, 17.3785f, 18.2024f, 17.2998f, 18.5498f, 17.2998f)
                curveTo(19.7924f, 17.2998f, 20.7998f, 18.3072f, 20.7998f, 19.5498f)
                curveTo(20.7998f, 20.7924f, 19.7924f, 21.7998f, 18.5498f, 21.7998f)
                curveTo(17.3072f, 21.7998f, 16.2998f, 20.7924f, 16.2998f, 19.5498f)
                curveTo(16.2998f, 19.2024f, 16.3785f, 18.8735f, 16.5191f, 18.5797f)
                lineTo(16.3902f, 18.4508f)
                curveTo(15.6741f, 18.9335f, 14.8709f, 19.2976f, 14.0079f, 19.5158f)
                curveTo(13.6371f, 20.2474f, 12.878f, 20.7501f, 11.9999f, 20.7501f)
                curveTo(11.0949f, 20.7501f, 10.3162f, 20.2161f, 9.9589f, 19.4479f)
                curveTo(9.1433f, 19.2139f, 8.3808f, 18.8507f, 7.6955f, 18.3821f)
                curveTo(7.6641f, 18.4349f, 7.6258f, 18.4847f, 7.5804f, 18.5301f)
                lineTo(6.5466f, 19.5639f)
                curveTo(6.6772f, 19.8489f, 6.75f, 20.166f, 6.75f, 20.5f)
                curveTo(6.75f, 21.7426f, 5.7426f, 22.75f, 4.5f, 22.75f)
                curveTo(3.2574f, 22.75f, 2.25f, 21.7426f, 2.25f, 20.5f)
                curveTo(2.25f, 19.2574f, 3.2574f, 18.25f, 4.5f, 18.25f)
                curveTo(4.8606f, 18.25f, 5.2014f, 18.3348f, 5.5035f, 18.4856f)
                lineTo(6.5197f, 17.4694f)
                curveTo(6.5314f, 17.4577f, 6.5434f, 17.4465f, 6.5557f, 17.4357f)
                curveTo(5.6138f, 16.4923f, 4.9085f, 15.3126f, 4.5394f, 13.9961f)
                curveTo(4.2285f, 14.1583f, 3.8749f, 14.25f, 3.5f, 14.25f)
                curveTo(2.2574f, 14.25f, 1.25f, 13.2426f, 1.25f, 12.0f)
                curveTo(1.25f, 10.7574f, 2.2574f, 9.75f, 3.5f, 9.75f)
                curveTo(3.8544f, 9.75f, 4.1896f, 9.8319f, 4.4878f, 9.9779f)
                curveTo(4.7672f, 8.8819f, 5.282f, 7.8827f, 5.9759f, 7.0366f)
                lineTo(4.4701f, 5.5307f)
                curveTo(4.1763f, 5.6713f, 3.8474f, 5.75f, 3.5f, 5.75f)
                curveTo(2.2574f, 5.75f, 1.25f, 4.7426f, 1.25f, 3.5f)
                curveTo(1.25f, 2.2574f, 2.2574f, 1.25f, 3.5f, 1.25f)
                close()
                moveTo(4.25f, 3.5f)
                curveTo(4.25f, 3.0858f, 3.9142f, 2.75f, 3.5f, 2.75f)
                curveTo(3.0858f, 2.75f, 2.75f, 3.0858f, 2.75f, 3.5f)
                curveTo(2.75f, 3.9142f, 3.0858f, 4.25f, 3.5f, 4.25f)
                curveTo(3.9142f, 4.25f, 4.25f, 3.9142f, 4.25f, 3.5f)
                close()
                moveTo(12.114f, 18.25f)
                curveTo(15.5198f, 18.25f, 18.25f, 15.5198f, 18.25f, 12.114f)
                lineTo(18.2498f, 12.0625f)
                curveTo(18.2219f, 8.6061f, 15.3938f, 5.7781f, 11.9375f, 5.7502f)
                curveTo(8.4905f, 5.7224f, 5.7224f, 8.4905f, 5.7502f, 11.9375f)
                curveTo(5.7781f, 15.3938f, 8.6061f, 18.2219f, 12.0625f, 18.2498f)
                curveTo(12.0797f, 18.2499f, 12.0969f, 18.25f, 12.114f, 18.25f)
                close()
                moveTo(19.75f, 11.2927f)
                curveTo(20.0413f, 11.3956f, 20.25f, 11.6734f, 20.25f, 12.0f)
                curveTo(20.25f, 12.3266f, 20.0413f, 12.6044f, 19.75f, 12.7073f)
                verticalLineTo(11.2927f)
                close()
                moveTo(19.5f, 3.75f)
                curveTo(19.0858f, 3.75f, 18.75f, 4.0858f, 18.75f, 4.5f)
                curveTo(18.75f, 4.9142f, 19.0858f, 5.25f, 19.5f, 5.25f)
                curveTo(19.9142f, 5.25f, 20.25f, 4.9142f, 20.25f, 4.5f)
                curveTo(20.25f, 4.0858f, 19.9142f, 3.75f, 19.5f, 3.75f)
                close()
                moveTo(3.5f, 11.25f)
                curveTo(3.9142f, 11.25f, 4.25f, 11.5858f, 4.25f, 12.0f)
                curveTo(4.25f, 12.4142f, 3.9142f, 12.75f, 3.5f, 12.75f)
                curveTo(3.0858f, 12.75f, 2.75f, 12.4142f, 2.75f, 12.0f)
                curveTo(2.75f, 11.5858f, 3.0858f, 11.25f, 3.5f, 11.25f)
                close()
                moveTo(17.7998f, 19.5498f)
                curveTo(17.7998f, 19.964f, 18.1356f, 20.2998f, 18.5498f, 20.2998f)
                curveTo(18.964f, 20.2998f, 19.2998f, 19.964f, 19.2998f, 19.5498f)
                curveTo(19.2998f, 19.1356f, 18.964f, 18.7998f, 18.5498f, 18.7998f)
                curveTo(18.1356f, 18.7998f, 17.7998f, 19.1356f, 17.7998f, 19.5498f)
                close()
                moveTo(4.5f, 21.25f)
                curveTo(4.9142f, 21.25f, 5.25f, 20.9142f, 5.25f, 20.5f)
                curveTo(5.25f, 20.0858f, 4.9142f, 19.75f, 4.5f, 19.75f)
                curveTo(4.0858f, 19.75f, 3.75f, 20.0858f, 3.75f, 20.5f)
                curveTo(3.75f, 20.9142f, 4.0858f, 21.25f, 4.5f, 21.25f)
                close()
                moveTo(11.25f, 3.5f)
                curveTo(11.25f, 3.0858f, 11.5858f, 2.75f, 12.0f, 2.75f)
                curveTo(12.4142f, 2.75f, 12.75f, 3.0858f, 12.75f, 3.5f)
                curveTo(12.75f, 3.9142f, 12.4142f, 4.25f, 12.0f, 4.25f)
                curveTo(11.5858f, 4.25f, 11.25f, 3.9142f, 11.25f, 3.5f)
                close()
            }
        }
            .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
