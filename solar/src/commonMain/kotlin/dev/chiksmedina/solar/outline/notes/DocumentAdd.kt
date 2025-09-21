package dev.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.NotesGroup

val NotesGroup.DocumentAdd: ImageVector
    get() {
        if (_documentAdd != null) {
            return _documentAdd!!
        }
        _documentAdd = Builder(
            name = "DocumentAdd", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.9436f, 1.25f)
                horizontalLineTo(13.0564f)
                curveTo(14.8942f, 1.25f, 16.3498f, 1.25f, 17.489f, 1.4031f)
                curveTo(18.6614f, 1.5608f, 19.6104f, 1.8929f, 20.3588f, 2.6412f)
                curveTo(20.6516f, 2.9341f, 20.6516f, 3.409f, 20.3588f, 3.7019f)
                curveTo(20.0659f, 3.9948f, 19.591f, 3.9948f, 19.2981f, 3.7019f)
                curveTo(18.8749f, 3.2787f, 18.2952f, 3.025f, 17.2892f, 2.8898f)
                curveTo(16.2615f, 2.7516f, 14.9068f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(9.0932f, 2.75f, 7.7385f, 2.7516f, 6.7108f, 2.8898f)
                curveTo(5.7048f, 3.025f, 5.1251f, 3.2787f, 4.7019f, 3.7019f)
                curveTo(4.2787f, 4.1251f, 4.025f, 4.7048f, 3.8898f, 5.7108f)
                curveTo(3.7516f, 6.7385f, 3.75f, 8.0932f, 3.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.75f, 15.9068f, 3.7516f, 17.2615f, 3.8898f, 18.2892f)
                curveTo(4.025f, 19.2952f, 4.2787f, 19.8749f, 4.7019f, 20.2981f)
                curveTo(5.1251f, 20.7213f, 5.7048f, 20.975f, 6.7108f, 21.1102f)
                curveTo(7.7385f, 21.2484f, 9.0932f, 21.25f, 11.0f, 21.25f)
                horizontalLineTo(13.0f)
                curveTo(14.9068f, 21.25f, 16.2615f, 21.2484f, 17.2892f, 21.1102f)
                curveTo(18.2952f, 20.975f, 18.8749f, 20.7213f, 19.2981f, 20.2981f)
                curveTo(19.994f, 19.6022f, 20.2048f, 18.5208f, 20.2414f, 15.9892f)
                curveTo(20.2474f, 15.575f, 20.588f, 15.2441f, 21.0022f, 15.2501f)
                curveTo(21.4163f, 15.2561f, 21.7472f, 15.5967f, 21.7412f, 16.0108f)
                curveTo(21.7061f, 18.4383f, 21.549f, 20.1685f, 20.3588f, 21.3588f)
                curveTo(19.6104f, 22.1071f, 18.6614f, 22.4392f, 17.489f, 22.5969f)
                curveTo(16.3498f, 22.75f, 14.8942f, 22.75f, 13.0564f, 22.75f)
                horizontalLineTo(10.9436f)
                curveTo(9.1058f, 22.75f, 7.6502f, 22.75f, 6.511f, 22.5969f)
                curveTo(5.3386f, 22.4392f, 4.3896f, 22.1071f, 3.6412f, 21.3588f)
                curveTo(2.8929f, 20.6104f, 2.5608f, 19.6614f, 2.4031f, 18.489f)
                curveTo(2.25f, 17.3498f, 2.25f, 15.8942f, 2.25f, 14.0564f)
                verticalLineTo(9.9436f)
                curveTo(2.25f, 8.1058f, 2.25f, 6.6502f, 2.4031f, 5.511f)
                curveTo(2.5608f, 4.3386f, 2.8929f, 3.3896f, 3.6412f, 2.6412f)
                curveTo(4.3896f, 1.8929f, 5.3386f, 1.5608f, 6.511f, 1.4031f)
                curveTo(7.6502f, 1.25f, 9.1058f, 1.25f, 10.9436f, 1.25f)
                close()
                moveTo(18.1131f, 7.0456f)
                curveTo(19.1739f, 5.9848f, 20.8937f, 5.9848f, 21.9544f, 7.0456f)
                curveTo(23.0152f, 8.1063f, 23.0152f, 9.8261f, 21.9544f, 10.8869f)
                lineTo(17.1991f, 15.6422f)
                curveTo(16.9404f, 15.901f, 16.7654f, 16.076f, 16.5693f, 16.2289f)
                curveTo(16.3387f, 16.4088f, 16.0892f, 16.563f, 15.8252f, 16.6889f)
                curveTo(15.6007f, 16.7958f, 15.3659f, 16.8741f, 15.0187f, 16.9897f)
                lineTo(12.9351f, 17.6843f)
                curveTo(12.4751f, 17.8376f, 11.9679f, 17.7179f, 11.625f, 17.375f)
                curveTo(11.2821f, 17.0321f, 11.1624f, 16.5249f, 11.3157f, 16.0649f)
                lineTo(11.9963f, 14.0232f)
                curveTo(12.001f, 14.0091f, 12.0056f, 13.9951f, 12.0102f, 13.9813f)
                curveTo(12.1259f, 13.6342f, 12.2042f, 13.3993f, 12.3111f, 13.1748f)
                curveTo(12.437f, 12.9108f, 12.5912f, 12.6613f, 12.7711f, 12.4307f)
                curveTo(12.924f, 12.2346f, 13.099f, 12.0596f, 13.3578f, 11.8009f)
                curveTo(13.3681f, 11.7906f, 13.3785f, 11.7802f, 13.3891f, 11.7696f)
                lineTo(18.1131f, 7.0456f)
                close()
                moveTo(20.8938f, 8.1062f)
                curveTo(20.4188f, 7.6313f, 19.6488f, 7.6313f, 19.1738f, 8.1062f)
                lineTo(18.992f, 8.288f)
                curveTo(19.0019f, 8.3215f, 19.0132f, 8.3571f, 19.0262f, 8.3945f)
                curveTo(19.1202f, 8.6657f, 19.2988f, 9.0243f, 19.6372f, 9.3628f)
                curveTo(19.9757f, 9.7013f, 20.3343f, 9.8798f, 20.6055f, 9.9738f)
                curveTo(20.6429f, 9.9868f, 20.6785f, 9.9981f, 20.712f, 10.008f)
                lineTo(20.8938f, 9.8262f)
                curveTo(21.3687f, 9.3512f, 21.3687f, 8.5812f, 20.8938f, 8.1062f)
                close()
                moveTo(19.5664f, 11.1536f)
                curveTo(19.2485f, 10.9866f, 18.9053f, 10.7521f, 18.5766f, 10.4234f)
                curveTo(18.2479f, 10.0947f, 18.0134f, 9.7515f, 17.8464f, 9.4336f)
                lineTo(14.4497f, 12.8303f)
                curveTo(14.1487f, 13.1314f, 14.043f, 13.2388f, 13.9538f, 13.3532f)
                curveTo(13.841f, 13.4979f, 13.7442f, 13.6545f, 13.6652f, 13.8202f)
                curveTo(13.6028f, 13.9511f, 13.5539f, 14.0936f, 13.4193f, 14.4976f)
                lineTo(13.019f, 15.6985f)
                lineTo(13.3015f, 15.981f)
                lineTo(14.5024f, 15.5807f)
                curveTo(14.9064f, 15.4461f, 15.0489f, 15.3972f, 15.1798f, 15.3348f)
                curveTo(15.3455f, 15.2558f, 15.5021f, 15.159f, 15.6468f, 15.0462f)
                curveTo(15.7612f, 14.957f, 15.8686f, 14.8513f, 16.1697f, 14.5503f)
                lineTo(19.5664f, 11.1536f)
                close()
                moveTo(7.25f, 9.0f)
                curveTo(7.25f, 8.5858f, 7.5858f, 8.25f, 8.0f, 8.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 8.25f, 15.25f, 8.5858f, 15.25f, 9.0f)
                curveTo(15.25f, 9.4142f, 14.9142f, 9.75f, 14.5f, 9.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 9.75f, 7.25f, 9.4142f, 7.25f, 9.0f)
                close()
                moveTo(7.25f, 13.0f)
                curveTo(7.25f, 12.5858f, 7.5858f, 12.25f, 8.0f, 12.25f)
                horizontalLineTo(10.5f)
                curveTo(10.9142f, 12.25f, 11.25f, 12.5858f, 11.25f, 13.0f)
                curveTo(11.25f, 13.4142f, 10.9142f, 13.75f, 10.5f, 13.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 13.75f, 7.25f, 13.4142f, 7.25f, 13.0f)
                close()
                moveTo(7.25f, 17.0f)
                curveTo(7.25f, 16.5858f, 7.5858f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(9.5f)
                curveTo(9.9142f, 16.25f, 10.25f, 16.5858f, 10.25f, 17.0f)
                curveTo(10.25f, 17.4142f, 9.9142f, 17.75f, 9.5f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                close()
            }
        }
            .build()
        return _documentAdd!!
    }

private var _documentAdd: ImageVector? = null
