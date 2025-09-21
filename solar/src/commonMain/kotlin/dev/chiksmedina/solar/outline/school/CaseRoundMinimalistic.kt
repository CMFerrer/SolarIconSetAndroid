package dev.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.CaseRoundMinimalistic: ImageVector
    get() {
        if (_caseRoundMinimalistic != null) {
            return _caseRoundMinimalistic!!
        }
        _caseRoundMinimalistic = Builder(
            name = "CaseRoundMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.9436f, 5.25f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 5.25f, 17.3498f, 5.25f, 18.489f, 5.4031f)
                curveTo(19.6614f, 5.5608f, 20.6104f, 5.8929f, 21.3588f, 6.6412f)
                curveTo(22.1071f, 7.3896f, 22.4392f, 8.3385f, 22.5969f, 9.511f)
                curveTo(22.75f, 10.6502f, 22.75f, 12.1058f, 22.75f, 13.9436f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4392f, 19.6614f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6614f, 22.4392f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4392f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6614f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                verticalLineTo(13.9436f)
                curveTo(1.25f, 12.1058f, 1.25f, 10.6502f, 1.4031f, 9.511f)
                curveTo(1.5608f, 8.3385f, 1.8929f, 7.3896f, 2.6412f, 6.6412f)
                curveTo(3.3896f, 5.8929f, 4.3386f, 5.5608f, 5.511f, 5.4031f)
                curveTo(6.6502f, 5.25f, 8.1058f, 5.25f, 9.9436f, 5.25f)
                close()
                moveTo(5.7108f, 6.8898f)
                curveTo(4.7048f, 7.025f, 4.1251f, 7.2787f, 3.7019f, 7.7019f)
                curveTo(3.5095f, 7.8943f, 3.3522f, 8.119f, 3.225f, 8.4014f)
                curveTo(5.0521f, 9.5876f, 6.2526f, 10.3528f, 7.2635f, 10.8578f)
                curveTo(7.3299f, 10.5116f, 7.6344f, 10.25f, 8.0f, 10.25f)
                curveTo(8.4142f, 10.25f, 8.75f, 10.5858f, 8.75f, 11.0f)
                verticalLineTo(11.4579f)
                curveTo(10.8694f, 12.0975f, 13.1306f, 12.0975f, 15.25f, 11.458f)
                verticalLineTo(11.0f)
                curveTo(15.25f, 10.5858f, 15.5858f, 10.25f, 16.0f, 10.25f)
                curveTo(16.3656f, 10.25f, 16.6701f, 10.5116f, 16.7365f, 10.8578f)
                curveTo(17.7474f, 10.3528f, 18.9479f, 9.5876f, 20.775f, 8.4015f)
                curveTo(20.6479f, 8.119f, 20.4905f, 7.8943f, 20.2981f, 7.7019f)
                curveTo(19.8749f, 7.2787f, 19.2952f, 7.025f, 18.2892f, 6.8898f)
                curveTo(17.2615f, 6.7516f, 15.9068f, 6.75f, 14.0f, 6.75f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 6.75f, 6.7385f, 6.7516f, 5.7108f, 6.8898f)
                close()
                moveTo(21.1397f, 9.9531f)
                curveTo(19.2527f, 11.1759f, 17.9585f, 11.9851f, 16.75f, 12.5046f)
                verticalLineTo(13.0f)
                curveTo(16.75f, 13.4142f, 16.4142f, 13.75f, 16.0f, 13.75f)
                curveTo(15.5913f, 13.75f, 15.2589f, 13.423f, 15.2502f, 13.0164f)
                curveTo(13.1199f, 13.578f, 10.8801f, 13.578f, 8.7498f, 13.0164f)
                curveTo(8.7411f, 13.423f, 8.4087f, 13.75f, 8.0f, 13.75f)
                curveTo(7.5858f, 13.75f, 7.25f, 13.4142f, 7.25f, 13.0f)
                verticalLineTo(12.5045f)
                curveTo(6.0415f, 11.985f, 4.7474f, 11.1758f, 2.8603f, 9.953f)
                curveTo(2.7514f, 10.9494f, 2.75f, 12.2393f, 2.75f, 14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2952f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7108f, 21.1102f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2892f, 21.1102f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2952f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                curveTo(21.25f, 12.2394f, 21.2486f, 10.9495f, 21.1397f, 9.9531f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9999f, 2.75f)
                curveTo(11.0215f, 2.75f, 10.187f, 3.375f, 9.8778f, 4.2499f)
                curveTo(9.7397f, 4.6405f, 9.3113f, 4.8452f, 8.9207f, 4.7071f)
                curveTo(8.5302f, 4.5691f, 8.3255f, 4.1406f, 8.4635f, 3.7501f)
                curveTo(8.978f, 2.2946f, 10.366f, 1.25f, 11.9999f, 1.25f)
                curveTo(13.6339f, 1.25f, 15.0219f, 2.2946f, 15.5364f, 3.7501f)
                curveTo(15.6744f, 4.1406f, 15.4697f, 4.5691f, 15.0792f, 4.7071f)
                curveTo(14.6886f, 4.8452f, 14.2601f, 4.6405f, 14.1221f, 4.2499f)
                curveTo(13.8129f, 3.375f, 12.9784f, 2.75f, 11.9999f, 2.75f)
                close()
            }
        }
            .build()
        return _caseRoundMinimalistic!!
    }

private var _caseRoundMinimalistic: ImageVector? = null
